package work.$pattern.COMPLITE.$18Observable.standart;

import java.util.Observable;

public class Data extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public Data() {
    }

    public void dataChanged(){
        setChanged();
        notifyObservers();
    }

    public void setData(float t, float h, float p){
        temperature=t;
        humidity=h;
        pressure=p;
        dataChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
