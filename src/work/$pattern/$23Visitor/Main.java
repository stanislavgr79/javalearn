package work.$pattern.$23Visitor;

public class Main {

    public static void main(String[] args) {

//        ConcretVisitor concretVisitor = new ConcretVisitor();
        Dog dog = new Dog();
        dog.doJob(new ConcretVisitor());

    }
}

interface Visitor{
    void doDog();
    void doCat();
}

class ConcretVisitor implements Visitor{

    @Override
    public void doDog() {
        System.out.println("gav gav");
    }

    @Override
    public void doCat() {
        System.out.println("may may");
    }
}

interface Animal{
    void doJob(Visitor visitor);
}

class Dog implements Animal{

    @Override
    public void doJob(Visitor visitor) {
        visitor.doDog();
    }
}

class Cat implements Animal{

    @Override
    public void doJob(Visitor visitor) {
        visitor.doCat();
    }
}