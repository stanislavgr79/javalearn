package work.java_learn.$pattern.COMPLITE.$33FactoryMethod.$01_watch;

import java.util.Date;

public class DigitalWatchImp implements Watch{

    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}
