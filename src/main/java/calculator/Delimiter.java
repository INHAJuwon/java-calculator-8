package calculator;

import java.util.regex.Pattern;

public class Delimiter {
    private final String PREFIX = "//";
    private final String SUFFIX = "\\n";
    private final String BASE = ",|:";
    private final int BASE_LENGTH = 2;

    public String findDelimiter(String str){
        String base = BASE;
        checkNull(str);

        while(customDelimiterPre(str) && customDelimiterSuf(str)){
            String custom=customDelimiter(str);
            base = addBase(base,custom);
            str=subString(str);
        }

        return base;
    }
    public String findNumbs(String str){
        checkNull(str);

        while(customDelimiterPre(str) && customDelimiterSuf(str)){
            str = subString(str);
        }
        return str;
    }
    private String addBase(String base,String custom){
        return base + "|" + Pattern.quote(custom);
    }
    private String customDelimiter(String str){
        int end=str.indexOf(SUFFIX);
        return str.substring(BASE_LENGTH,end);
    }
    private void checkNull(String str){
        if(str == null){
            throw new IllegalArgumentException();
        }
    }
    private boolean customDelimiterPre(String str){
        return str.startsWith(PREFIX);
    }
    private boolean customDelimiterSuf(String str){
        return str.contains(SUFFIX);
    }
    private String subString(String str){
        return str.substring(str.indexOf(SUFFIX) + 2);
    }
}
