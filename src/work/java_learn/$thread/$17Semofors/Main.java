package work.java_learn.$thread.$17Semofors;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        Semaphore table = new Semaphore( 2 );

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3= new Person();
        Person person4 = new Person();
        Person person5 = new Person();
        Person person6 = new Person();
        Person person7 = new Person();
        Person person8 = new Person();

        person1.table=table;
        person2.table=table;
        person3.table=table;
        person4.table=table;
        person5.table=table;
        person6.table=table;
        person7.table=table;
        person8.table=table;

        person1.start();
        person2.start();
        person3.start();
        person4.start();
        person5.start();
        person6.start();
        person7.start();
        person8.start();
    }
}

class Person extends Thread{
    Semaphore table;

    @Override
    public void run() {
        System.out.println(this.getName() + " waiting");
        try {
            table.acquire();
            System.out.println(this.getName() + " eat");
            System.out.println(this.getName() + " out");
            table.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}