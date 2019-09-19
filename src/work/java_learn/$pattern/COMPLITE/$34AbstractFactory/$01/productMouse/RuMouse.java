package work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$01.productMouse;

import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$01.abstractProduct.Mouse;

public class RuMouse implements Mouse {

    @Override
    public void click() {
        System.out.println("один клик");
    }

    @Override
    public void doubleClick() {
        System.out.println("двойной клик");
    }

    @Override
    public void scroll(int direction) {
        if(direction>0) System.out.println("scroll вверх");
        else if(direction<0) System.out.println("scroll вниз");
        else System.out.println("нет движения scroll");
    }
}
