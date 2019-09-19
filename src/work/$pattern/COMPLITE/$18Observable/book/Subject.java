package work.$pattern.COMPLITE.$18Observable.book;

public interface Subject {

    void registerObserver(Observer obj);
    void removeObserver(Observer obj);
    void notifyObservers();

}
