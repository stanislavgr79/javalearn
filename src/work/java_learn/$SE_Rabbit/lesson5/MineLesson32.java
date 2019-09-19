package work.java_learn.$SE_Rabbit.lesson5;

import work.java_learn.$SE_Rabbit.lesson33.Cat;
import work.java_learn.$SE_Rabbit.lesson33.Serializator;

import java.io.InvalidObjectException;

public class MineLesson32 {

    public static void main(String[] args) {

        //  Cat cat = new Cat();
        //   cat.setName( "Tom" );

        //    Serializator serializator = new Serializator();
        //    serializator.serialization(cat);
        //    System.out.println( serializator.serialization( cat ));

        Serializator serializator = new Serializator();
        try {
            Cat cat = serializator.deserialization();
            System.out.println( cat.getName() );
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }


    }
}