package work.$pattern.COMPLITE.$33FactoryMethod.$01_watch;

public class Main {

    public static void main(String[] args) {

//      WatchMaker watchMaker = new RomeWatchMaker();
//      Watch watch = watchMaker.createWatch();
//      watch.showTime();

      FactoryWatch factory = new FactoryWatch();
//      factory.setWatchMaker("rome");
      factory.setWatchMaker("digital");
      Watch watch = factory.createWatch();
      watch.showTime();

      Watch watch1 = FactoryWatch.foo("rome");
      watch1.showTime();

      Watch watch2 = factory.getWatch("rome");
      watch2.showTime();
    }



}

