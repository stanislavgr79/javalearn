package work.$Z$GREAT.lesson6_anyobj_to_1met;

public class Lesson {

    public static void main(String[] args) {
        Book book = new Book("Java", "Cay");
        Journal journal = new Journal("News");
        read(book);
        read(journal);
        read2( book );
        read2(journal);

        System.out.println(read3( book ));
        System.out.println(read3( journal ));

    }

    static void read(Printable interface1){
        interface1.print();
    }
    static void read2(Test testabstract){
        testabstract.print2();
    }
    static String read3(Test testAbstrWithReturn){
        return testAbstrWithReturn.print2Str();
    }

}
abstract class Test{

    abstract void print2();
    abstract String print2Str();
}

interface Printable{

    void print();
}

class Book extends Test implements Printable{
    String name;
    String author;

    Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public void print() {
        System.out.printf("%s (%s) \n", name, author);
    }

    @Override
    void print2() {
        System.out.printf("(void method from abstract class) %s (%s) \n", name, author);
    }

    @Override
    String print2Str() {
        String temp = "(NOTvoid method from abstract class) " + name +" " + author;
        return temp;
    }
}
class Journal extends Test implements Printable {
    private String name;

    Journal(String name){
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }

    @Override
    void print2() {
        System.out.println("(void method from abstract class) " + name);
    }

    @Override
    String print2Str() {
        String temp = "(NOTvoid method from abstract class)" + name;
        return temp;
    }
}
