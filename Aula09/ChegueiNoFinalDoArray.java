//UNchecked
public class ChegueiNoFinalDoArray extends ArrayIndexOutOfBoundsException{
//Checked
//public class ChegueiNoFinalDoArray extends Exception{
    @Override
    public String getMessage() {
        return "Array Chegou no final";
    }
}