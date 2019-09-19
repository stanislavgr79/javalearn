package work.$pattern.COMPLITE.$5Adapter;

public class Main2 {

    public static void main(String[] args) {

        Job.method(new A());
        Job.method(new Adapter1(new B()));

    }
}

class Adapter1 implements Ia{
    Ib ib;

    public Adapter1(Ib ib) {
        this.ib = ib;
    }

    @Override
    public void doSomething() {
        ib.doSomething();
    }
}

interface Ia{
    void doSomething();
}

class A implements Ia{

    @Override
    public void doSomething() {
        System.out.println("a do something");
    }
}

interface Ib{
    void doSomething();
}

class B implements Ib{

    @Override
    public void doSomething() {
        System.out.println("b do something");
    }
}

class Job{

    final static void method(Ia ia){
        ia.doSomething();
    }
}