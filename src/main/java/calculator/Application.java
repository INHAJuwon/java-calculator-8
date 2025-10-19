package calculator;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Input read = new Input();
        InputValue input = new InputValue(read.readString());

        Output result = new Output();
        Delimiter delimiter = new Delimiter();
        Splitter splitter = new Splitter();
        Calculator calculator = new Calculator();

        Parser parser = new Parser(delimiter, splitter);
        Parameter parameter = parser.parse(input);

        int output = calculator.calculate(parameter);
        result.printResult(output);
    }
}
