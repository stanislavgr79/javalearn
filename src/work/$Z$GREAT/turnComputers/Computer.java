package work.$Z$GREAT.turnComputers;

public class Computer implements Istatus{

    private String name;

    public Computer(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println("Computer " + name + " turn on!");
    }

    @Override
    public void turnOff() {
        System.out.println("Computer " + name + " turn off!");
    }
}
