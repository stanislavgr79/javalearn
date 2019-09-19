package work.java_learn.$SE_Rabbit.lesson5;

import work.java_learn.$SE_Rabbit.lesson20.Music;

public class MainLesson20 {
    public static void main(String[] args) {
        Music ms = Music.CLASSIC;

        for (Music element: Music.values()){
            System.out.println(element);

        }
        System.out.println(ms.ordinal());

        Music mc2 = Music.valueOf(Music.class,"ROCK");

        System.out.println(mc2);

        switch (ms){
            case CLASSIC:
                System.out.println("CLASSIC!!!!!");
                break;
            case ROCK:
                System.out.println("ROCK");
                break;
            case POP:
                System.out.println("POP");
                break;

        }
        System.out.println(ms.getI());
        System.out.println(ms.getName());
        ms.foo();
    }

}

