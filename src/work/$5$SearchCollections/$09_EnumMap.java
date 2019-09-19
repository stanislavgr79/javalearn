package work.$5$SearchCollections;

import java.util.*;
import java.util.stream.Collectors;

public class $09_EnumMap {

    public static void main(String[] args) {

        EnumMap<Day_ofWeek, String> map = new EnumMap<>(Day_ofWeek.class);
        map.put(Day_ofWeek.Mondey, "sex");

        String string= map.get(Day_ofWeek.Mondey);
//        System.out.println(string);

        Set<Person> names = new HashSet<>();
        names.add(new Person("John", 22));
        names.add(new Person("Ana", 33));
        names.add(new Person("Mary", 16));
        names.add(new Person("Anthony", 24));
        names.add(new Person("Mark", 25));

        List list = names.stream().filter(o->!o.getName().startsWith("A")).collect(Collectors.toList());

        Person min = names.stream().min(Comparator.comparingInt(Person::getAge)).get();

//        names.removeIf(o->o.getName().startsWith("A"));
        names.stream().forEach(o-> System.out.println(o));
        System.out.println(min);

    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

enum Day_ofWeek {Mondey, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}