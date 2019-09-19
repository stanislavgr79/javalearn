package work.java_learn.$pattern.COMPLITE.$18Observable;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Observer ob1 = new Observer( "one" );
        Observer ob2 = new Observer( "two" );

        ob1.setState( "good" );

    }
}
interface Observable{
    void update();
}

class Observer implements Observable{
    static List<Observer> observers = new ArrayList<>(  );

    String name;
    String state;

    public Observer(String name) {
        this.name = name;
        observers.add( this );
    }

    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    void notifyAllObservers(){
        for(Observer ob: observers){
            ob.update();
        }
    }
    @Override
    public void update(){
        System.out.println("name :" + name + " change status to " + state);
    }
}

