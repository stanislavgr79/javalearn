package work.$pattern.COMPLITE.$10Fasade;

public class Main2 {

    public static void main(String[] args) {
        CopmputerFasad copmputerFasad = new CopmputerFasad();
        copmputerFasad.copy();

    }
}

class CopmputerFasad{
    Power power = new Power();
    DVDrom dvDrom = new DVDrom();
    HDD hdd = new HDD();
    void copy(){
        power.on();
        dvDrom.load();
        hdd.copyFromDVD(dvDrom);
    }
}

class Power{

    void on(){
        System.out.println("on");
    }

    void off(){
        System.out.println("off");
    }
}

class DVDrom{
    private boolean data = false;

    public boolean hasData(){
        return data;
    }

    void load(){
        data = true;
    }

    void unload(){
        data = false;
    }
}

class HDD {
    void copyFromDVD(DVDrom dvd){
        if(dvd.hasData()){
            System.out.println("copy");
        } else {
            System.out.println("insert dvd");
        }

    }
}