package work.$pattern.$1singleton;

public class Main {

    public static void main(String[] args) {
        Singelton singelton1 = Singelton.getInstance();
        Singelton singelton2 = Singelton.getInstance();

        Person person = Person.getInstance();

    }
}

class Singelton {
    private static Singelton singelton = new Singelton();

    private Singelton(){
    }

    public static Singelton getInstance(){
        return singelton;
    }
}

class Person {
    private static Person person = new Person();

    private Person(){}

    public static Person getInstance(){
        return person;
    }
}