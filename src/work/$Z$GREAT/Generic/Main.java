package work.$Z$GREAT.Generic;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Animal> listofanimals = new ArrayList<>(  );
        listofanimals.add(new Animal(1) );
        listofanimals.add(new Animal(2) );

        List<Dog> listofdog = new ArrayList<>(  );
        listofdog.add( new Dog( 5 ) );
        listofdog.add( new Dog( 6 ) );

        test( listofdog );
    }
    private static void test(List<? extends Animal> list){
        for (Animal element:
             list) {
            System.out.println(element);
        }


    }

}
