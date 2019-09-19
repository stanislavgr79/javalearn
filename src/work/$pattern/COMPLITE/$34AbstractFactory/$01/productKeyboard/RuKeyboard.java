package work.$pattern.COMPLITE.$34AbstractFactory.$01.productKeyboard;

import work.$pattern.COMPLITE.$34AbstractFactory.$01.abstractProduct.Keyboard;

public class RuKeyboard implements Keyboard {

    @Override
    public void print() {
        System.out.println("печать без новой строки");
    }

    @Override
    public void println() {
        System.out.println("печать с новой строки");
    }
}
