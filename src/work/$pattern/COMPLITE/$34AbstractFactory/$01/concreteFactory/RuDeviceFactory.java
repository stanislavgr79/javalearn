package work.$pattern.COMPLITE.$34AbstractFactory.$01.concreteFactory;

import work.$pattern.COMPLITE.$34AbstractFactory.$01.abstractFactoty.DeviceFactory;
import work.$pattern.COMPLITE.$34AbstractFactory.$01.abstractProduct.Keyboard;
import work.$pattern.COMPLITE.$34AbstractFactory.$01.abstractProduct.Mouse;
import work.$pattern.COMPLITE.$34AbstractFactory.$01.abstractProduct.Touchpad;
import work.$pattern.COMPLITE.$34AbstractFactory.$01.productKeyboard.RuKeyboard;
import work.$pattern.COMPLITE.$34AbstractFactory.$01.productMouse.RuMouse;
import work.$pattern.COMPLITE.$34AbstractFactory.$01.productTouchpad.RuTouchpad;

public class RuDeviceFactory implements DeviceFactory {

    @Override
    public Mouse getMouse() {
        return new RuMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new RuTouchpad();
    }
}
