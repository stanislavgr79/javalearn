package work.Solo.exceptions;

public class Exceptions {

    public static void main(String[]args) {
        Example example = new Example();
        try {
            example.method2();
            example.method1();


        }catch (NewException e){
            System.out.println(e.toString());
        }catch (Exception e){
            System.out.println(e.toString());
       }
    }

}
