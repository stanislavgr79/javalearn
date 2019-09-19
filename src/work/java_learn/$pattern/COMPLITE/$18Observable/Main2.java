package work.java_learn.$pattern.COMPLITE.$18Observable;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        HumanPlus humanPlus = new HumanPlus();
        MeteoSt meteoSt = new MeteoSt();
        meteoSt.addObserver(humanPlus);
        meteoSt.setData(5, 5);
    }
}

interface ObserverTest{
    void handleEvent(int t, int p);
}

class HumanPlus implements ObserverTest {


    @Override
    public void handleEvent(int t, int p) {
        System.out.println(t + p);
    }

}

interface Observered{
    void addObserver(ObserverTest observer);
    void removeObserver(ObserverTest observer);
    void notifyAllObservers();
}

class MeteoSt implements Observered {
        int temperature;
        int pressure;

        List<ObserverTest> list = new ArrayList<>();

    @Override
    public void addObserver(ObserverTest observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(ObserverTest observer) {
        list.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        if(list.isEmpty()) return;
        list.forEach(obj-> obj.handleEvent(temperature, pressure));
    }

    void setData(int t, int p){
        temperature=t;
        pressure=p;
        notifyAllObservers();
    }
}