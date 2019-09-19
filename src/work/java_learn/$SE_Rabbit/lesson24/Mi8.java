package work.java_learn.$SE_Rabbit.lesson24;

public class Mi8 extends Helicopter implements VerticalTakeOff{

    @Override
    public void fly() {
        System.out.println("Helicopter Mi8");
    }

    @Override
    public void verticalTakeOff() {
        System.out.println("Mi8 vertical");
    }
}
