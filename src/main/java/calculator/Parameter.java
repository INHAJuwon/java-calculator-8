package calculator;

public class Parameter {
    private final String[] numbers;
    private final String delimiters;

    public Parameter(String str){
        Delimiter dt = new Delimiter();

        this.delimiters = dt.findDelimiter(str);
        String numStr = dt.findNumbs(str);
        //Delimiter 클래스를 통해 받아온 데이터를 가지고 문자열을 배열로 만들어줄 클래스가 필요
    }
    public String[] getNumbs(){
        return numbers;
    }
    public String getDelimiters(){
        return delimiters;
    }
}