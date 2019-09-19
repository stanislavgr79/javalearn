package work.$pattern.COMPLITE.$34AbstractFactory.$02.productTV;

import work.$pattern.COMPLITE.$34AbstractFactory.$02.abstractProduct.TV;

public class AnalogTVImp implements TV {

    @Override
    public void showPicture() {
        System.out.println("analog TV");
    }
}
