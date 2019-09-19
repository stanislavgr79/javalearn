package work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$02.concreteFactory;


import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$02.abstractFactory.Factory;
import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$02.abstractProduct.TV;
import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$02.abstractProduct.Watch;
import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$02.productWatch.DigitalWatchImp;
import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$02.productWatch.RomeWatchImp;


public class WatchFactory implements Factory {
    public Watch createWatch(String name){
        switch (name){
            case "digital": return new DigitalWatchImp();
            case "rome": return new RomeWatchImp();
            default: return null;
        }
    }

    @Override
    public TV createTV(String name) {
        return null;
    }
}
