package work.$pattern.$30ServiceLocator;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        Iservices iservices = BussLocator.getService("Serv1");
        iservices.doSomething();



    }
}

interface Iservices{
    String getname();
    void doSomething();
}

class Serv1 implements Iservices{
    @Override
    public String getname() {
        return "Serv1";
    }

    @Override
    public void doSomething() {
        System.out.println("serv1 do");
    }
}

class Serv2 implements Iservices{
    @Override
    public String getname() {
        return "Serv2";
    }

    @Override
    public void doSomething() {
        System.out.println("serv2 do");
    }
}

class CacheServ{
    List <Iservices> list = new ArrayList<>();

    Iservices getServFromList(String serName){
        for(Iservices iservices: list){
            if(iservices.getname().equals(serName)){
                return iservices;
            }
        }return null;
    }

    void addServ(Iservices serName){
        for (Iservices iservices: list){
            if(!iservices.getname().equals(serName.getname())){
                list.add(serName);
            }
        }
    }
}

class LookUP{

    Iservices setServ(String serName){
        if(serName.equals("Serv1")){
            return new Serv1();
        }else if(serName.equals("Serv2")){
            return new Serv2();
        } return null;
    }
}

class BussLocator{
    static CacheServ cacheServ = new CacheServ();

    static Iservices getService(String serName){
        Iservices iservices = cacheServ.getServFromList(serName);
        if(iservices!=null){
            return iservices;
        }
        LookUP lookUP = new LookUP();
        iservices = (Iservices) lookUP.setServ(serName);
        cacheServ.addServ(iservices);
        return iservices;
    }



}