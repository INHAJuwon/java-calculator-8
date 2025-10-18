package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Input input = new Input();
        Output result = new Output();
        Calculator calculator = new Calculator();

        String str = input.getInput();
        int output = calculator.calculate(str);
        result.printResult(output);
        Console.close();
    }
}
