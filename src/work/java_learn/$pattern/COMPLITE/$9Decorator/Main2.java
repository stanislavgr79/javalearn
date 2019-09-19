package work.java_learn.$pattern.COMPLITE.$9Decorator;

public class Main2 {

    public static void main(String[] args) {

        Itarget deca = new Deca();
        deca.foof();

    }
}


class Deca implements Itarget{
Itarget itarget = new Target();


    @Override
    public void foof() {
        itarget.foof();
        System.out.println("deca");
    }
}

interface Itarget{
    void foof();
}

class Target implements Itarget{

    @Override
    public void foof() {
        System.out.println("real target");
    }
}