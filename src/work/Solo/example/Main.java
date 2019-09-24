package work.Solo.example;

public class Main {

    public static void main(String[] args) {

        Output output = new Output();
        output.setX( 5 );
        output.setY( 6 );
        
        Input input = new Input();
        input.foo2(output);
        System.out.println(input.foo2(output));
    }
}
