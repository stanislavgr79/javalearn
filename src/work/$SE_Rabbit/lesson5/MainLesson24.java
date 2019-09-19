package work.$SE_Rabbit.lesson5;


import work.$SE_Rabbit.lesson24.Boeing737;
import work.$SE_Rabbit.lesson24.Mi8;
import work.$SE_Rabbit.lesson24.Test;

public class MainLesson24 {
    public static void main(String[] args) {
        Mi8 mi8 = new Mi8();
        Boeing737 boeing737 = new Boeing737();

        Test test = new Test();
        test.foo(mi8);

    }
}

