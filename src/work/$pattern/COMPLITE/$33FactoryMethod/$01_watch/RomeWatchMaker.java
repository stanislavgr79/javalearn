package work.$pattern.COMPLITE.$33FactoryMethod.$01_watch;

public class RomeWatchMaker implements WatchMaker {

    @Override
    public Watch createWatch() {
        return new RomeWatchImp();
    }
}
