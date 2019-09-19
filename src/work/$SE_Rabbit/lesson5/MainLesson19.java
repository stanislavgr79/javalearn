package work.$SE_Rabbit.lesson5;

import work.$SE_Rabbit.lesson19.Encapsulation;

public class MainLesson19 {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.showResault();
        System.out.println(encapsulation.showResault());

        encapsulation.setA(10);
        encapsulation.getA();
        System.out.println(encapsulation.getA());
    }

}

