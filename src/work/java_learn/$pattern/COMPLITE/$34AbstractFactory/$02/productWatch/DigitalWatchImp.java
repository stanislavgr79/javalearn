package work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$02.productWatch;

import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$02.abstractProduct.Watch;

import java.util.Date;

public class DigitalWatchImp implements Watch {

    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}
