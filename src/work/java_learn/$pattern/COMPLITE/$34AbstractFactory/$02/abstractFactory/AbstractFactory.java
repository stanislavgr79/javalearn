package work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$02.abstractFactory;


import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$02.concreteFactory.TVFactory;
import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$02.concreteFactory.WatchFactory;

public class AbstractFactory{

    public Factory createFactory(String nameOfFactory){
        switch (nameOfFactory){
            case ("TV"): return new TVFactory();
            case ("watch"): return new WatchFactory();
            default: return null;
        }
    };
}
