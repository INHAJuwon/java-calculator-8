package calculator;

public class Calculator {
    public int calculate(Parameter parameter) {
        return sum(parameter.getNumbers());
    }

    private int sum(String[] numbers) {
        if (numbers == null) {
            return 0;
        }

        int sum = 0;

        for (String space : numbers) {
            int add = checkString(space);
            checkNegative(add);
            sum += add;
        }

        return sum;
    }

    private int checkString(String space) {
        try {
            return blankOrEmpty(space);
        } catch (NumberFormatException error) {
            throw new IllegalArgumentException("입력이 숫자가 아님");
        }
    }

    private int blankOrEmpty(String input) {
        if (input.isBlank()) return 0;
        return Integer.parseInt(input);
    }

    private void checkNegative(int integer) {
        if (integer < 0) {
            throw new IllegalArgumentException("음수");
        }
    }
}
