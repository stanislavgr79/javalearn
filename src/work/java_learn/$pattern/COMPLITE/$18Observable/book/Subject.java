package work.java_learn.$pattern.COMPLITE.$18Observable.book;

public interface Subject {

    void registerObserver(Observer obj);
    void removeObserver(Observer obj);
    void notifyObservers();

}
