package calculator;

public class Splitter {
    public String[] splitString(String input, String delimiter) {
        if (input == null) {
            throw new IllegalArgumentException();
        }
        return input.split(delimiter);
    }
}
