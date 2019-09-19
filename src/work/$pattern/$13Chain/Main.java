package work.$pattern.$13Chain;

public class Main {
    public static void main(String[] args) {

        Chain myChain1 = new PrintToConsole();
        PrintToFile ptf = new PrintToFile();
        PrintToDataBase pdb = new PrintToDataBase();
        myChain1.setNextAction( ptf );
        ptf.setNextAction( pdb );
//
        myChain1.print( " hello " );

    }
}

abstract class Chain{
    Chain nextChield;

    public void setNextAction(Chain child) {
        nextChield = child;
    }

    void print(String message){
        printAnyMessage( message );
        if(nextChield != null){
            nextChield.print( message );
        }
    }

    abstract void printAnyMessage(String message);

}

class PrintToConsole extends Chain{

    @Override
    void printAnyMessage(String message) {
        System.out.println("PrintToConsole " + message);
    }
}

class PrintToFile extends Chain{

    @Override
    void printAnyMessage(String message) {
        System.out.println("PrintToFile " + message);
    }
}

class PrintToDataBase extends Chain{

    @Override
    void printAnyMessage(String message) {
        System.out.println("PrintToDataBase " + message);
    }
}

