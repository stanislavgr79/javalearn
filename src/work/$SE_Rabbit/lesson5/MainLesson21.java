package work.$SE_Rabbit.lesson5;


import work.$SE_Rabbit.lesson21.Birds;
import work.$SE_Rabbit.lesson21.Crow;
import work.$SE_Rabbit.lesson21.Ostrich;
import work.$SE_Rabbit.lesson21.Test;

public class MainLesson21 {
    public static void main(String[] args) {

        //   Ostrich ostrich = new Ostrich("");

        //  Crow crow = new Crow();

        // ostrich.setName("ostrich");
        // System.out.println(ostrich.getName());

        // Birds ostrich2 = new Ostrich("");
        // ostrich2.setName( "страус" );
        //    System.out.println(ostrich2.getName());

        //   ostrich.walk();
        // ostrich.walk( "Ha ha ha" );

        //Birds ostrich2 = new Birds( "" );
        //Birds crow = new Birds( "" );

        Birds ostrich = new Ostrich( "" );
        Birds crow = new Crow( "" );

        Test test = new Test();
        test.foo(ostrich);

    }
}

