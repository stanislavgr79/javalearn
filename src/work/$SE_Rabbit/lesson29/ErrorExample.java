package work.$SE_Rabbit.lesson29;

public class ErrorExample {

    private ABC abc;


    public void foo() {
        // System.out.println(1/0);
        //   int array [] = {1,2,3};
        //   array[5]=3;
        try {
            //        abc.show();
            System.out.println( 1 / 0 );



        } catch (NullPointerException | ArithmeticException e) {
            e.printStackTrace();
            //System.out.println( "Деление на ноль" );
    //    }catch (ArithmeticException ex){
     //       ex.printStackTrace();
        }
    }

}
