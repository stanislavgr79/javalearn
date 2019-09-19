package work.$SE_Rabbit.lesson21;

public class Crow extends Birds {


    public Crow(String name) {
        super( name);
    }


    public void fly() {
        System.out.println( "i can fly" );
    }

    @Override
    public void walk() {
        System.out.println("kar kar");;
    }
}
