package work.$pattern.COMPLITE.$34AbstractFactory.$01.productTouchpad;

import work.$pattern.COMPLITE.$34AbstractFactory.$01.abstractProduct.Touchpad;

public class EnTouchpad implements Touchpad {

    @Override
    public void track(int deltaX, int deltaY) {
        int step = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        System.out.println("move on " + step + "pixels");
    }
}
