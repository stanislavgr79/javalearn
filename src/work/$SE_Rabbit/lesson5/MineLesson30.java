package work.$SE_Rabbit.lesson5;

import work.$SE_Rabbit.lesson30.PerimeterException;
import work.$SE_Rabbit.lesson30.PerimeterSquare;

public class MineLesson30 {

    public static void main(String[] args) {
        PerimeterSquare perimeterSquare= new PerimeterSquare();
        try {
            perimeterSquare.getPerimeter("g");
        } catch (PerimeterException e) {
            e.printStackTrace();
        }

    }
}