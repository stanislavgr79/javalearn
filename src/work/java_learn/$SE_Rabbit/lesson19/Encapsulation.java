package work.java_learn.$SE_Rabbit.lesson19;

public class Encapsulation {

    private int a, b;



    public int showResault(){
        return a+b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}