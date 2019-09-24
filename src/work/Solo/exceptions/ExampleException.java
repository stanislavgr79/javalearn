package work.Solo.exceptions;

public class ExampleException extends Exception{
    private String myText;

    public ExampleException (String myText){
        this.myText = myText;
    }

    public String getMyText() {
        return myText;
    }
}
