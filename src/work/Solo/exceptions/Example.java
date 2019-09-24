package work.Solo.exceptions;


public class Example {

    public void method1() throws ExampleException {
        throw new ExampleException("Vasya");
    }
    public void method2() throws NewException{
        throw new NewException();
    }
}
