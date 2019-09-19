package work.$pattern.$13Chain.$03;

public class Main {

    public static void main(String[] args) {

    }
}


class Level{
    public static final int ERROR = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;
}

interface Logger{
    void writeMessage(String message, int level);
}