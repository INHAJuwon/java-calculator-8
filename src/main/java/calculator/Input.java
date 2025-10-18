package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Input {
    private final String input;

    public Input(){
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        input = Console.readLine();
    }

    public String getInput(){
        return input;
    }
}
