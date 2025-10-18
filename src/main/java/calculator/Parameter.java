package calculator;

public class Parameter {
    private final String[] numbers;
    private final String delimiters;

    public Parameter(String str){
        Delimiter dt = new Delimiter();
        Splitter sp = new Splitter();

        this.delimiters = dt.findDelimiter(str);
        String numStr = dt.findNumbs(str);
        this.numbers = sp.splitStr(numStr,delimiters);
    }
    public String[] getNumbs(){
        return numbers;
    }
    public String getDelimiters(){
        return delimiters;
    }
}