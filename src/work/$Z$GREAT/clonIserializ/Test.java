package work.$Z$GREAT.clonIserializ;

import java.io.*;
import java.util.Scanner;

public class Test {

    public static void main(String[] args)  {
        Person user1 = new Person();
        user1.level=45;
//        user1.sword.weight=10;
        Sword sword = new Sword();
        sword.weight=11;
        user1.sword=sword;
        user1.sword.weight=1;

        Scanner scanner = new Scanner( System.in );
        System.out.println("Введите имя файла");
        String newFileName = scanner.nextLine() +".bin";

        File file = new File ("src/temp",newFileName);
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream( file ))) {
            oos.writeObject( user1 );
        } catch (IOException e) {
            e.printStackTrace();
        }


//        for(ObjectOutputStream oos = ObjectOutputStream(new FileOutputStream(oos) )){
//
//        }

    }
}

class Person implements Serializable {
    int level;
    Sword sword;
}

class Sword implements Serializable{
    int weight;
}