package work.java_learn.$pattern.COMPLITE.$32Delegate;

public class Main {

    public static void main(String[] args) {

        B b = new B();
        b.foo();

        Delegate delegate = new Delegate();
        delegate.setGraphics(new Triangle());
        delegate.draw1();
        delegate.setGraphics(new Square());
        delegate.draw1();
    }
}

