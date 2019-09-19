package work.$pattern.COMPLITE.$17Momento;

public class Main {

    public static void main(String[] args) {
        Originator myorigEkz = new Originator();
        System.out.println("устанавливаем статус экземпляра в one");
        myorigEkz.setState( "one" );
        System.out.println("получить статус экземпляра :" + myorigEkz.getState());

        SaveBox sb1 = new SaveBox();
        System.out.println("сохраняем статус через CareTaker: careTaker.setMomento( myorigEkz.createMomento() );");
        sb1.setMomento( myorigEkz.createMomento() );

        System.out.println("меняем статус экземпляра на TWO");
        myorigEkz.setState( "two" );
        System.out.println("получить статус экземпляра после замены :" + myorigEkz.getState());

        System.out.println("восстанавливаем статус экземпляра из CareTaker myorigEkz.getDataFromMomento(careTaker.getMomento());");
        myorigEkz.getDataFromMomento(sb1.getMomento());
        System.out.println("получить статус экземпляра после восстановления myorigEkz.getState():" + myorigEkz.getState());

    }
}

class SaveBox {
    // будет хранить наш Momento
    Momento momento;


    public Momento getMomento() {
        return momento;
    }

    public void setMomento(Momento momento) {
        this.momento = momento;
    }
}

class Originator{
    String state;
    int age;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    // создаем save копию создав экз автомат Momento (c конструктором)
    Momento createMomento(){
        return new Momento( this.state, this.age );
    }
    // выгребает из Momento save
    void getDataFromMomento(Momento momento){
        this.state=momento.getState();
        this.age=momento.getAge();
    }

}

class Momento{
    String state;
    int age;

    public String getState() {
        return state;
    }

    public int getAge() {
        return age;
    }

    public Momento(String state, int age) {
        this.state = state;
        this.age = age;
    }
}