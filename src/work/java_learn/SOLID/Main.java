package work.java_learn.SOLID;

import java.util.Scanner;

public class Main {
    private static Scanner s;

    public static void main(String[] args) {
        Car car = new Car();
        foo( car );
        Child child = new Child();
        foo( child );

        System.out.println("");
        Test test = new Test();
        System.out.println("=============");
        test.doJob(car);
        test.doJob(child);
        System.out.println("============");
        Idrive car1 = new Car();
        foo( car1 );
        car1.drive();
        System.out.println("-------------");
        Idrive child1 = new Child();
        foo( child1 );
        child1.drive();

    }
    public static void foo(Idrive idrive){
        idrive.drive();
    }
}

interface Idrive{
    void drive();
}

class Car implements Idrive{
private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public void drive() {
        driveCar();
    }

    private void driveCar() {
        System.out.println("drive car");
    }
}
class Child extends Car{

    @Override
    public void drive() {
        driveCarChild();
    }

    private void driveCarChild() {
        System.out.println("drive carChild");
    }
}

class Test{
    Idrive car = new Car();
    Idrive child = new Child();

    void doJob(Car car){
        car.drive();

    }
    void doJob(Child child){
        child.drive();
    }


}