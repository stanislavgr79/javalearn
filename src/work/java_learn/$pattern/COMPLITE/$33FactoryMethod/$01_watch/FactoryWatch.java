package work.java_learn.$pattern.COMPLITE.$33FactoryMethod.$01_watch;

public class FactoryWatch {
    WatchMaker watchMaker;

    FactoryWatch(){}

    FactoryWatch (String name){
        setWatchMaker(name);
    }

    public void setWatchMaker(String name){
        switch (name){
            case "digital": watchMaker = new DigitalWatchMaker(); break;
            case "rome": watchMaker = new RomeWatchMaker(); break;
            default: return;
        }
    }

    public Watch getWatch(String name){
        switch (name){
            case "digital": return new DigitalWatchImp();
            case "rome": return new RomeWatchImp();
            default: return null;
        }
    }

    public Watch createWatch(){
        return  watchMaker.createWatch();
    }

    public static Watch foo(String name){
        FactoryWatch factoryWatch = new FactoryWatch(name);
        return factoryWatch.createWatch();
    }
}
