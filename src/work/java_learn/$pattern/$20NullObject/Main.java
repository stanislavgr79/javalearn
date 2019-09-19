package work.java_learn.$pattern.$20NullObject;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        Animal a1 = getAnimal();

    }

    static Animal getAnimal(){
        try {
            if( new File("131231").exists())
            return new Lion();
        }finally {
            return new NullAnimal();
        }
    }

}

interface Animal{
    void eat();
}

class Lion implements Animal{

    @Override
    public void eat() {
        System.out.println("My lion eating...");
    }
}

class NullAnimal implements Animal{

    @Override
    public void eat() {

    }
}