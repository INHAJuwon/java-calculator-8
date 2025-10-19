package calculator;

public class Parser {
    private final Delimiter delimiter;
    private final Splitter splitter;

    public Parser(Delimiter delimiter, Splitter splitter) {
        this.delimiter = delimiter;
        this.splitter = splitter;
    }

    public Parameter parse(InputValue rawInput) {
        String stringInput = rawInput.getInput();
        if (stringInput.isBlank()) {
            return new Parameter(new String[0]);
        }

        String foundDelimiters = delimiter.findDelimiter(stringInput);
        String numericString = delimiter.findNumbers(stringInput);

        String[] numbers = splitter.splitString(numericString, foundDelimiters);

        return new Parameter(numbers);
    }
}
