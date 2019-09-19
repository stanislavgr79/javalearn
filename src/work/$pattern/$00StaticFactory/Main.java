package work.$pattern.$00StaticFactory;

public class Main {

    public static void main(String[] args) {

        Car  car = Car.valueOf("bmw", 200);

    }
}

// неизменяемый класс со статистической фабрикой
class Car {
    private String name;
    private int speed;

    private Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public static Car valueOf(String name, int speed){
        return new Car(name, speed);
    }

}
