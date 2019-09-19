package work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$01.concreteFactory;

import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$01.abstractFactoty.DeviceFactory;
import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$01.abstractProduct.Keyboard;
import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$01.abstractProduct.Mouse;
import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$01.abstractProduct.Touchpad;
import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$01.productKeyboard.EnKeyboard;
import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$01.productMouse.EnMouse;
import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$01.productTouchpad.EnTouchpad;

public class EnDeviceFactory implements DeviceFactory {

    @Override
    public Mouse getMouse() {
        return new EnMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new EnTouchpad();
    }
}
