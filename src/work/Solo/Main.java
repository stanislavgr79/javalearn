package work.Solo;

public class Main {

    public static void main(String[] args) {

        BMW newCar1 = new BMW(Colors.BLUE, "sport");
        System.out.println(newCar1.getColors());
        System.out.println(Colors.BLUE.getIdColor());
        System.out.println(newCar1.getType());
        newCar1.drive();
        System.out.println(newCar1.getSpeed());

        Car newCar2 = new BMW( Colors.RED,"family" );
        Test123 test123 = new Test123();
        test123.foo( newCar1 );
        test123.foo( newCar2 );

    }

}
