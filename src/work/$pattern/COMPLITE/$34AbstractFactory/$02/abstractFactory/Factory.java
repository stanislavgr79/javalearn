package work.$pattern.COMPLITE.$34AbstractFactory.$02.abstractFactory;


import work.$pattern.COMPLITE.$34AbstractFactory.$02.abstractProduct.TV;
import work.$pattern.COMPLITE.$34AbstractFactory.$02.abstractProduct.Watch;

public interface Factory{
    Watch createWatch(String name);
    TV createTV(String name);
}
