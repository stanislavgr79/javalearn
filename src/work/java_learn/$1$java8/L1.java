package work.java_learn.$1$java8;

import java.awt.event.ActionListener;

public class L1 {

    public static void main(String[] args) {

       Runnable runnable1 = ()-> System.out.println("hello");
        ActionListener actionListener = event-> System.out.println(event.paramString());

    }

}
