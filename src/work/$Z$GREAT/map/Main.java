package work.$Z$GREAT.map;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map map1 = new HashMap(  );
        Map map2 = new Hashtable(  );
        Map map3 = new LinkedHashMap(  );
        Map map4 = new HashMap(  );

        Ticket t1 = new Ticket( 123 );
        Ticket t2 = new Ticket( 333 );
        Ticket t3 = new Ticket( 444 );

        map1.put( t1, new Book( "dpp1", "warner1" ) );
        map1.put( t2, new Book( "dpp2", "warner2" ) );
        map1.put( t3, new Book( "dpp3", "warner3" ) );

        Book searchBook1 = (Book) map1.get( t1 );
        System.out.println(searchBook1);

        System.out.println("!!!!!!!!!!");
        Set set = map1.entrySet();
        for (Object o: set){
            System.out.println(o);
        }

        System.out.println("!!!!!!!");
        Set set2 = map1.keySet();
        for (Object o: set2){
            System.out.println(o);
        }
        System.out.println("!!!!!!!");
        map1.forEach( (o, o2) -> {
            if(o.equals( t2 ))
            System.out.println( o + " " + o2 );
           }
        );


    }


}
class Book{
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class Ticket{
    int id;

    public Ticket(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id == ticket.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash( id );
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                '}';
    }
}