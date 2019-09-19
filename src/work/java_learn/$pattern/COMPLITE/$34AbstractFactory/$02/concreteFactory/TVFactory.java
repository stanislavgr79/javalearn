package work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$02.concreteFactory;


import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$02.abstractFactory.Factory;
import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$02.abstractProduct.TV;
import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$02.abstractProduct.Watch;
import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$02.productTV.AnalogTVImp;
import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$02.productTV.DigitalTVImp;

public class TVFactory implements Factory {
    @Override
    public Watch createWatch(String name) {
        return null;
    }

    public TV createTV(String name){
        switch (name){
            case "digital": return new DigitalTVImp();
            case "analog": return new AnalogTVImp();
            default: return null;
        }
    }
}
