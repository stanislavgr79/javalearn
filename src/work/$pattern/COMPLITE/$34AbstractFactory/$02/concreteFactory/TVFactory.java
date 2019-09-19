package work.$pattern.COMPLITE.$34AbstractFactory.$02.concreteFactory;


import work.$pattern.COMPLITE.$34AbstractFactory.$02.abstractFactory.Factory;
import work.$pattern.COMPLITE.$34AbstractFactory.$02.abstractProduct.TV;
import work.$pattern.COMPLITE.$34AbstractFactory.$02.abstractProduct.Watch;
import work.$pattern.COMPLITE.$34AbstractFactory.$02.productTV.AnalogTVImp;
import work.$pattern.COMPLITE.$34AbstractFactory.$02.productTV.DigitalTVImp;

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
