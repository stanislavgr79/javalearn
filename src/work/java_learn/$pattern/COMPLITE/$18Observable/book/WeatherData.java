package work.java_learn.$pattern.COMPLITE.$18Observable.book;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void removeObserver(Observer obj) {
        observers.removeIf(o->o.equals(obj));
    }

    @Override
    public void notifyObservers() {
//        for(int i=0; i<observers.size(); i++){
//            Observer observer = (Observer) observers.get(i);
//            observer.update(temperature, humidity, pressure);
//        }
//        observers.forEach(o->((Observer) o)
//                        .update(temperature, humidity, pressure));

        observers.iterator()
                .forEachRemaining(object-> ((Observer)object)
                        .update(temperature, humidity, pressure) );
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }
}
