package work.$pattern.COMPLITE.$34AbstractFactory.$01.productKeyboard;

import work.$pattern.COMPLITE.$34AbstractFactory.$01.abstractProduct.Keyboard;

public class EnKeyboard implements Keyboard {

    @Override
    public void print() {
        System.out.println(" en print without step next line");
    }

    @Override
    public void println() {
        System.out.println("en print with step next line");
    }
}
