package work.$pattern.COMPLITE.$34AbstractFactory.$01;


import work.$pattern.COMPLITE.$34AbstractFactory.$01.abstractFactoty.DeviceFactory;
import work.$pattern.COMPLITE.$34AbstractFactory.$01.concreteFactory.EnDeviceFactory;
import work.$pattern.COMPLITE.$34AbstractFactory.$01.concreteFactory.RuDeviceFactory;
import work.$pattern.COMPLITE.$34AbstractFactory.$01.abstractProduct.Keyboard;
import work.$pattern.COMPLITE.$34AbstractFactory.$01.abstractProduct.Mouse;
import work.$pattern.COMPLITE.$34AbstractFactory.$01.abstractProduct.Touchpad;

public class Main {

    public static void main(String[] args) {
        DeviceFactory deviceFactory = getDeviceFactory("en");
        Mouse mouse = deviceFactory.getMouse();
        Keyboard keyboard = deviceFactory.getKeyboard();
        Touchpad touchpad = deviceFactory.getTouchpad();

        mouse.click();
        keyboard.print();
        touchpad.track(4,4);

    }

    private static DeviceFactory getDeviceFactory(String name){
        switch (name){
            case "ru": return new RuDeviceFactory();
            case "en": return new EnDeviceFactory();
            default: throw new RuntimeException("unsupported country code" + name);
        }
    }
}


