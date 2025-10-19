package calculator;

import java.util.regex.Pattern;

public class Delimiter {
    private final String PREFIX = "//";
    private final String SUFFIX = "\\n";
    private final String BASE = ",|:";
    private final int BASE_LENGTH = 2;

    public String findDelimiter(String input) {
        String base = BASE;
        checkNull(input);

        while (customDelimiterPrefix(input) && customDelimiterSuffix(input)) {
            String custom = customDelimiter(input);
            base = addBase(base, custom);
            input = subString(input);
        }

        return base;
    }

    public String findNumbers(String input) {
        checkNull(input);

        while (customDelimiterPrefix(input) && customDelimiterSuffix(input)) {
            input = subString(input);
        }
        return input;
    }

    private String addBase(String base, String custom) {
        return base + "|" + Pattern.quote(custom);
    }

    private String customDelimiter(String input) {
        int end = input.indexOf(SUFFIX);
        return input.substring(BASE_LENGTH, end);
    }

    private void checkNull(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }
    }

    private boolean customDelimiterPrefix(String input) {
        return input.startsWith(PREFIX);
    }

    private boolean customDelimiterSuffix(String input) {
        return input.contains(SUFFIX);
    }

    private String subString(String input) {
        return input.substring(input.indexOf(SUFFIX) + 2);
    }
}
