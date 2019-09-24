package work.Solo;

public class BMW extends Car {

    public BMW(Colors colors, String type) {
        super( colors, type );
    }

    public void hideSky (){
        System.out.println("i see sky");
    }

    @Override
    public void drive() {
        int is=80;
        setSpeed( is );
        System.out.println("vzik 80");
    }
}
