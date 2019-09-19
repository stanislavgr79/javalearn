package work.$1$java8;

import java.util.function.*;

public class L2 {

    public static void main(String[] args) {
        Predicate<Integer> predicate = x->x>5;
        System.out.println(predicate.test( 6));

        Consumer<Integer> consumer = x-> System.out.println(x);
        consumer.accept( 5 );

        Function<Integer, String> function = x->x.toString();


        UnaryOperator <Integer> unaryOperator = x->x*x;
        BinaryOperator<Integer> binaryOperator = (x, y)-> x*y;



    }
}
