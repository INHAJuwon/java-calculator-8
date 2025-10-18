package calculator;

public class Calculator {
    public int calculate(String str){
        Parameter parameter = new Parameter(str);
        String[] numbers = parameter.getNumbs();

        return sum(numbers);
    }
    private int sum(String[] numbs) {
        if(numbs == null){
            return 0;
        }

        int sum = 0;

        for (String s : numbs) {
            int add = checkStr(s);
            checkNegative(add);
            sum += add;
        }

        return sum;
    }
    private int checkStr(String s){
        try{
            return blankOrEmpty(s);
        }catch(NumberFormatException e){
            throw new IllegalArgumentException("입력이 숫자가 아님");
        }
    }
    private int blankOrEmpty(String str){
        if(str.isBlank())
            return 0;
        return Integer.parseInt(str);
    }
    private void checkNegative(int i){
        if(i < 0){
            throw new IllegalArgumentException("음수");
        }
    }
}
