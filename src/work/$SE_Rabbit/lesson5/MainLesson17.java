package work.$SE_Rabbit.lesson5;

import work.$SE_Rabbit.lesson17.Bus;
import work.$SE_Rabbit.lesson17.Engine;

public class MainLesson17 {
    public static void main(String[] args) {
        Bus bus = new Bus();
        String busKM = bus.showKM();
        Engine engine = new Engine();
        String type = engine.type;
        System.out.println(bus.showKM());
        System.out.println(type);
        int kmNew = 77;
        bus.showKM2(kmNew);
        String kmStr = "seven";
        bus.showKM3Str(kmStr);


    }

}

