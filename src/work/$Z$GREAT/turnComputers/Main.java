package work.$Z$GREAT.turnComputers;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    static String cache;
    static int count = 0;

    public static void main(String[] args) {

        Computer[] computers2 = new Computer[]{
                new Computer( "Sony" ),
                new Computer( "Mac" ),
                new Computer( "Linux" )
        };

        for (Computer computer : computers2) {
            computer.turnOn();
        }

        foo( computers2 );
    }

    static void foo(Computer[] computers2) {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Do you want to shoutdown the computers ? (Y/N)" );
        cache = scanner.nextLine();

        if (Objects.equals( cache, "Y" )) {
            System.out.println( " -- Computers will be turn off" );

            for (Computer comp : computers2) {
                comp.turnOff();
            }
        } else if (Objects.equals( cache, "N" )) {
            System.out.println( " -- Computers will continue to work" );

        } else {
            count++;
            System.out.println( " ======== bad command - now you try:" + count + ", 2 only try ==========" );
            if (count < 4) {
                foo( computers2 );
            } else {
                System.out.println( "you havn't more try. bb" );
            }
        }
    }


}



