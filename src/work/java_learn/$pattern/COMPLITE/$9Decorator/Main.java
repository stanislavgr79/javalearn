package work.java_learn.$pattern.COMPLITE.$9Decorator;

import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

//        InputStream inputStream = new BufferedInputStream( new FileInputStream( new File( "" ) ) );

//        Ifront ifront1 = new Front();
//        ifront1.foo();

        Ifront ifront2 = new Decorator( new Front() );
        ifront2.foo();

    }
}

abstract class AbDecorator implements Ifront{
    Ifront ifront;

    public AbDecorator(Ifront ifront) {
        this.ifront = ifront;
    }

    public abstract void foo();
}

class Decorator extends AbDecorator{

    public Decorator(Ifront ifront) {
        super( ifront );
    }

    @Override
    public void foo() {
        ifront.foo();
        System.out.println("my other methods");
    }
}



interface Ifront{
    void foo();
}

class Front implements Ifront{

    @Override
    public void foo() {
        System.out.println("metod front");
    }
}

