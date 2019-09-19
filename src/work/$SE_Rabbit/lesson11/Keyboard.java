package work.$SE_Rabbit.lesson11;

import java.util.Scanner;


public class Keyboard {
    public int x;

    public void keyb (){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите value");
        x = in.nextInt();

        OperatorSwitch os = new OperatorSwitch();
        os.setValue(x);
        System.out.println("keyb void check в х число:" + x);
        System.out.println("keyb void проверка :" + os.getValue());

    }

}
