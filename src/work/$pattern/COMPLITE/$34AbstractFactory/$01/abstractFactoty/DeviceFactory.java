package work.$pattern.COMPLITE.$34AbstractFactory.$01.abstractFactoty;


import work.$pattern.COMPLITE.$34AbstractFactory.$01.abstractProduct.Keyboard;
import work.$pattern.COMPLITE.$34AbstractFactory.$01.abstractProduct.Mouse;
import work.$pattern.COMPLITE.$34AbstractFactory.$01.abstractProduct.Touchpad;

public interface DeviceFactory{
    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}
