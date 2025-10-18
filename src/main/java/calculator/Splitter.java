package calculator;

public class Splitter {
    public String[] splitStr(String str,String delimiter){
        if(str == null){
            throw new IllegalArgumentException();
        }
        return str.split(delimiter);
    }
}
