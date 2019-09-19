package work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$01.productTouchpad;

import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$01.abstractProduct.Touchpad;

public class RuTouchpad implements Touchpad {

    @Override
    public void track(int deltaX, int deltaY) {
        int step = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        System.out.println("движение на " + step + " пикселей");
    }
}
