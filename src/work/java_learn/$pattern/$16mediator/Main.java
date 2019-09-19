package work.java_learn.$pattern.$16mediator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ConcretMediator mediator = new ConcretMediator();
        ConcreteCollegue cc1 = new ConcreteCollegue(mediator);
        ConcreteCollegue cc2 = new ConcreteCollegue(mediator);
        ConcreteCollegue cc3 = new ConcreteCollegue(mediator);

        mediator.add( cc1 );
        mediator.add( cc2 );
        mediator.add( cc3 );

        mediator.requestAll( cc1 );
        System.out.println(cc1.status);
        System.out.println(cc2.status);
        System.out.println(cc3.status);
        mediator.requestAll( cc3 );
        System.out.println("!!!!!!!!!!");
        System.out.println(cc1.status);
        System.out.println(cc2.status);
        System.out.println(cc3.status);

//        cc3.changeStatus(cc3);
        cc2.changeStatus();
//        cc2.changeStatus(cc2);
        System.out.println("!!!!!!!!!!!");
        System.out.println(cc1.status);
        System.out.println(cc2.status);
        System.out.println(cc3.status);
//        mediator.requestAll( cc2 );
//        System.out.println("!!!!!!!!!!!!!!");
//        System.out.println(cc1.status);
//        System.out.println(cc2.status);
//        System.out.println(cc3.status);
    }
}

interface Mediator{
    void requestAll(Collegue collegue);
}

class ConcretMediator implements Mediator{
    List<Collegue> collegues = new ArrayList<>(  );

    void add(Collegue collegue){
        collegues.add( collegue );
    }

    @Override
    public void requestAll(Collegue collegue) {
       if(collegue.getStatus()==false)  {collegue.setTrue();
        for(Collegue coll: collegues){
            if(coll!=collegue)
                coll.setFalse();}
        }
        else {collegue.setFalse();}
    }

}

interface Collegue{

    void setFalse();
    void setTrue();
    boolean getStatus();
    void changeStatus();
}

class ConcreteCollegue implements Collegue{
        boolean status;
        Mediator mediator;

    public boolean getStatus() {
        return status;
    }

    public ConcreteCollegue(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setFalse() {
        status=false;
    }

    @Override
    public void setTrue() {
        status=true;
    }

    @Override
    public void changeStatus() {
       mediator.requestAll(this );
    }
}