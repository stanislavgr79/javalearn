package work.$pattern.COMPLITE.$2builder.q;

public class Main2 {

    public static void main(String[] args) {

        Car car = new CarBuilder().builderMake("BMW").builderTransmision(Transmission.AUTO)
                .buildCar();
        System.out.println(car);

//        Car car = new CarBuilder().buildCar();
//        System.out.println(car);

        Director director = new Director();
        director.setBuilder(new FordBuilder());
        Car car1 =  director.doBuilderCar();
        System.out.println(car1);
    }
}

enum Transmission{
    AUTO, MANUAL
}

class Car{
    String make;
    Transmission transmission;
    int maxSpeed;

    public void setMake(String make) {
        this.make = make;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

//    public Car(CarBuilder carBuilder){
//        this.make=carBuilder.make;
//        this.transmission=carBuilder.transmission;
//        this.maxSpeed=carBuilder.maxSpeed;
//    }
    Car(){
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

abstract class CarBuilderAbstract{
    Car car;
    void createCar(){
        car = new Car();
    }

    abstract void buildMake();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();

    Car getCar(){
        return car;
    }
}

class Director{
    CarBuilderAbstract builder;

    void setBuilder(CarBuilderAbstract carBuilder){
        this.builder=carBuilder;
    }

    Car doBuilderCar(){
        builder.createCar();
        builder.buildMake();
        builder.buildTransmission();
        builder.buildMaxSpeed();
        Car car = builder.getCar();
        return car;
    }
}

class FordBuilder extends CarBuilderAbstract{

    @Override
    void buildMake() {
        car.setMake("FORD");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(100);
    }
}
class BMWBuilder extends CarBuilderAbstract{

    @Override
    void buildMake() {
        car.setMake("BMW");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(130);
    }
}

class CarBuilder{
    private String make = "default";
    private Transmission transmission = Transmission.MANUAL;
    private int maxSpeed = 120;

    CarBuilder builderMake(String make){
        this.make=make;
        return this;
    }

    CarBuilder builderTransmision(Transmission transmission){
        this.transmission=transmission;
        return this;
    }

    CarBuilder builderMaxSpeed(int maxSpeed){
        this.maxSpeed=maxSpeed;
        return this;
    }

//    Car buildCar(){
//        return new Car(this);
//    }

    Car buildCar(){
        Car car = new Car();
        car.setMake(make);
        car.setTransmission(transmission);
        car.setMaxSpeed(maxSpeed);
        return car;
    }
}