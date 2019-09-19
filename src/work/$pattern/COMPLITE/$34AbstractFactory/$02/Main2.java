package work.$pattern.COMPLITE.$34AbstractFactory.$02;

import work.$pattern.COMPLITE.$34AbstractFactory.$02.abstractFactory.AbstractFactory;
import work.$pattern.COMPLITE.$34AbstractFactory.$02.abstractProduct.Watch;
import work.$pattern.COMPLITE.$34AbstractFactory.$02.abstractFactory.Factory;

public class Main2 {

    public static void main(String[] args) {

        Factory factory = new AbstractFactory().createFactory("watch");
        Watch watch = factory.createWatch("digital");
        watch.showTime();

    }
}


