package work.$SE_Rabbit.lesson30;

public class PerimeterException extends Exception{

    public PerimeterException() {
    }

    public PerimeterException(String message) {
        super( message );
    }

    public PerimeterException(String message, Throwable cause) {
        super( message, cause );
    }

    public PerimeterException(Throwable cause) {
        super( cause );
    }

    public PerimeterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super( message, cause, enableSuppression, writableStackTrace );
    }
}
