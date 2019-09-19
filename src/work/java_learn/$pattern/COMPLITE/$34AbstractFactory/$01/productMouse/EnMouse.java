package work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$01.productMouse;

import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$01.abstractProduct.Mouse;

public class EnMouse implements Mouse {

    @Override
    public void click() {
        System.out.println("one click");
    }

    @Override
    public void doubleClick() {
        System.out.println("double click");
    }

    @Override
    public void scroll(int direction) {
        if(direction>0) System.out.println("scroll up");
        else if(direction<0) System.out.println("scroll down");
        else System.out.println("dont move scroll");
    }
}
