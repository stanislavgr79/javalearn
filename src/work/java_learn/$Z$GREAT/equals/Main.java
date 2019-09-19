package work.java_learn.$Z$GREAT.equals;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal( 1 );
        Animal animal2 = new Animal( 1 );
        String str1 = "2";
        String str2 = "2";
        Integer int1 = 2;
        Integer int2 = 2;
        System.out.println( Objects.equals( int1,int2) );
        System.out.println("-----------------");
        System.out.println(Objects.equals( animal1,animal2 ));

        Book1 book1 = new Book1( "Karnagi", "How to get Friends" );
        Map <Ticket1, Book1> library1 = new HashMap<>(  );


        Ticket1 t1 = new Ticket1( 123 );
        Ticket1 t2 = new Ticket1( 123 );
        library1.put( t1, book1 );
        Book1 newBook = library1.get(t2);
        System.out.println(newBook);

        System.out.println(book1.hashCode());
        System.out.println(newBook.hashCode());
    }

}
class Ticket1{
    int id;

    public Ticket1(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ticket1{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket1 ticket1 = (Ticket1) o;
        return id == ticket1.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash( id );
    }
}

class Book1 {
    String author1;
    String name;

    @Override
    public String toString() {
        return "Book1{" +
                "author1='" + author1 + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Book1(String author1, String name) {
        this.author1 = author1;
        this.name = name;


    }
}

class Animal {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}