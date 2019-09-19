package work.java_learn.$SE_Rabbit.lesson12;

import work.java_learn.$SE_Rabbit.lesson11.OperatorSwitch;

public class LoopControl {
    boolean value = true;
    int a = 5, b = 7;

    public void foo() {
        OperatorSwitch os = new OperatorSwitch();
        do {
            a++;
            System.out.println(a);
            if(a==6){
                break;
            }

        } while (a < b);


    }
}




