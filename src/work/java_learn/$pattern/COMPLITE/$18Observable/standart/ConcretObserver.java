package work.java_learn.$pattern.COMPLITE.$18Observable.standart;

import java.util.Observable;
import java.util.Observer;

public class ConcretObserver implements Observer {
Observable observable;

private float temperature;
private float humidity;

    public ConcretObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        if(observable instanceof Data) {
            Data data = (Data) observable;
            this.temperature=data.getTemperature();
            this.humidity=data.getHumidity();
            display();
        }
    }

    public void display(){
        System.out.println(temperature + " " + humidity);
    }
}
