package work.$pattern.$13Chain;

public class Main2 {

    public static void main(String[] args) {

        ChainChain chainChain = new Ch1();
        Ch2 ch2 = new Ch2();
        Ch3 ch3 = new Ch3();
        chainChain.setNextAction(ch2);
        ch2.setNextAction(ch3);

        chainChain.print("hoho");

    }
}

abstract class ChainChain {
ChainChain ich;

    void setNextAction(ChainChain ich){
        this.ich=ich;
    }

    void print(String str){
        foo(str);
        if(ich != null){
            ich.print(str);
        }
    }

    abstract public void foo(String str);
}

class Ch1 extends ChainChain{

    @Override
    public void foo(String str) {
        System.out.println("ch1 " + str);
    }
}

class Ch2 extends ChainChain{

    @Override
    public void foo(String str) {
        System.out.println("ch2 " + str);
    }
}

class Ch3 extends ChainChain{

    @Override
    public void foo(String str) {
        System.out.println("ch3 " + str);
    }
}