package work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$02.productTV;

import work.java_learn.$pattern.COMPLITE.$34AbstractFactory.$02.abstractProduct.TV;

public class DigitalTVImp implements TV {

    @Override
    public void showPicture() {
        System.out.println("digital TV");
    }
}
