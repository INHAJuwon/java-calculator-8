package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Input input = new Input();
        Output result = new Output();
        //계산을 하는 class Calculator 구현

        String str = input.getInput();
        //Calculator에서 계산된 결과값을 int output에 저장
        //result.printResult(output);
        Console.close();
    }
}
