package work.java_learn.$pattern.COMPLITE.$5Adapter;

public class Main {

    public static void main(String[] args) {

        First first1 = new First();
        first1.somemethod(new MyClass1());
        MyClass2 myClass2 = new MyClass2();
        MyClass1 myClass1 = new MyClass1();
//        first1.somemethod(new Adapter( new MyClass2() ));
        first1.somemethod(myClass2::methodClass2);
//        first1.somemethod(myClass1::methodClass1);
        Adapter adapter = new Adapter(myClass2);
        first1.somemethod(adapter);

    }
}

class Adapter implements Iclass1 {
    Iclass2 iclass2;

    public Adapter(Iclass2 iclass2) {
        this.iclass2 = iclass2;
    }

    @Override
    public void methodClass1() {
        System.out.println("new");
        iclass2.methodClass2();
    }
}

class First {

    public final void somemethod(Iclass1 iclass1){ // есть метод который принимает интерфейс какойто
        iclass1.methodClass1();  // и вызывает метод из этого интерфейса
    }
}

interface Iclass1{
    void methodClass1();
}
class MyClass1 implements Iclass1{ // класс метод которого можно вызвать

    @Override
    public void methodClass1() {
        System.out.println("1 class");
    }
}
/////////////////////////////////////////////////////////////////////////////////////////
interface Iclass2{
    void methodClass2();
}
class MyClass2 implements Iclass2{ // другой класс явл impl другого интерфейса

    @Override
    public void methodClass2() {
        System.out.println("2 class");
    }
}



