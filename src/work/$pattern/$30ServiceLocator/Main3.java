package work.$pattern.$30ServiceLocator;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {

    Irunner irunner = RunLocator.getService("run2");
    irunner.doJob();

    }
}


interface Irunner{
    String getName();
    void doJob();
}

class Run1 implements Irunner{
    @Override
    public String getName() {
        return "run1";
    }

    @Override
    public void doJob() {
        System.out.println("run1 do");
    }
}

class Run2 implements Irunner{
    @Override
    public String getName() {
        return "run2";
    }

    @Override
    public void doJob() {
        System.out.println("run2 do");
    }
}

class CacheRunner{
    static List<Irunner> list = new ArrayList<>();

    void addServ (Irunner irunnerName){
        for (Irunner irunner: list){
            if (!irunner.getName().equals(irunnerName.getName())){
                list.add(irunnerName);
            }
        }
    }

    Irunner getFromList(String servName){
        for (Irunner irunner: list){
            if (irunner.getName().equals(servName))
                return irunner;
        }
        return null;
    }

}

class LookUP2{

    Irunner setServ(String serName){
        if(serName.equals("run1")){
            return new Run1();
        }if (serName.equals("run2")){
            return new Run2();
        }else return null;
    }
}

class RunLocator{

    static CacheRunner cacheRunner = new CacheRunner();

    static Irunner getService(String servName){
        Irunner  irunner = cacheRunner.getFromList(servName);
        if(irunner!=null){
            return irunner;
        }
        LookUP2 lookUP2 = new LookUP2();
        irunner =  lookUP2.setServ(servName);
        cacheRunner.addServ(irunner);
        return irunner;
    }

}