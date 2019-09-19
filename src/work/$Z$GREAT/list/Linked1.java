package work.$Z$GREAT.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Linked1 {

    public static void main(String[] args) {


        List<Person> list = new ArrayList<>();
        Person person1 = new Person( "Alex" );
        Person person2 = new Person( "Oleg" );
        Person person3 = new Person( "Boris" );
//        list.add( person1 );
//        list.add( person2 );
//
//
////        System.out.println( list.get( 0 ) );
//
//        LinkedList<Person> list2 = new LinkedList<>();
//        list2.add( person1 );
//        list2.add( person2 );
//        list2.add( person3 );
//        list2.contains( person1 );
////        System.out.println(list2.get(list2.indexOf( person1 )));
//        list2.forEach( person -> System.out.println(person) );
////
        HashSet<Person> setPerson = new HashSet<>(  );
        setPerson.add( person1 );
        setPerson.add( person3 );
        setPerson.add( person2 );
        setPerson.forEach( person -> System.out.println(person) );


    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
