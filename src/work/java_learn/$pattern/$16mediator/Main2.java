package work.java_learn.$pattern.$16mediator;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

    }
}

interface Imediator {
    void requestAll(IcarChangeStatus icarChangeStatus);
}

class Med implements Imediator {
    List<Car> list = new ArrayList<>();

    void addToListRequest(Car car) {
        list.add(car);
    }

    @Override
    public void requestAll(IcarChangeStatus icarChangeStatus) {
        if (icarChangeStatus.getStatus() == false) {
            icarChangeStatus.setTrue();
            for (Car car : list) {
                if (car!=icarChangeStatus) {
                    car.setFalse();
                }
            }
        }else icarChangeStatus.setFalse();
    }
}

interface IcarChangeStatus {
    void setFalse();

    void setTrue();

    boolean getStatus();

    void changeStatus();
}

class Car implements IcarChangeStatus {
    boolean status;
    Imediator imediator;

    public Car(Imediator imediator) {
        this.imediator = imediator;
    }

    @Override
    public void setFalse() {
        status = false;
    }

    @Override
    public void setTrue() {
        status = true;
    }

    @Override
    public boolean getStatus() {
        return status;
    }

    @Override
    public void changeStatus() {
        imediator.requestAll(this);
    }


}