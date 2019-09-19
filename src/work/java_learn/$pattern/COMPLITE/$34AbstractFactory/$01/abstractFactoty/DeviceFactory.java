package work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$01.abstractFactoty;


import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$01.abstractProduct.Keyboard;
import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$01.abstractProduct.Mouse;
import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$01.abstractProduct.Touchpad;

public interface DeviceFactory{
    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}
