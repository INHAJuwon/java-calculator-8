package calculator;

public class Parameter {
    private final String[] numbers;
    private final String delimiters;

    public Parameter(String str){
        //Parameter는 값들을 관리하기 위함.
        // 생성자를 통해서 구분된 문자열과, 구분자, 구분된 문자열 배열을 받아온다.
    }
    public String[] getNumbs(){
        return numbers;
    }
    public String getDelimiters(){
        return delimiters;
    }
}