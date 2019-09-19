package work.$SE_Rabbit.lesson5;


import work.$SE_Rabbit.lesson11.Keyboard;
import work.$SE_Rabbit.lesson11.OperatorSwitch;

public class MainLesson11 {
    public static void main(String[] args) {

        OperatorSwitch os = new OperatorSwitch();
        //os.setValue(25);
        //os.foo();
        //System.out.println(os.getFirstValue());
        Keyboard ke = new Keyboard();
        ke.keyb();
        os.setValue(ke.x);
        System.out.println("вторая проверка в value число: " + os.getValue());
        //System.out.println("Результат :");
        os.foo();
    }

}

