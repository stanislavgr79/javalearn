package work.java_learn.$Z$GREAT.clonIserializ;

import java.io.*;

public class Mine5 implements Serializable{



    public static void main(String[] args) throws IOException, CloneNotSupportedException, ClassNotFoundException {

        My my = new My();
        my.i=1;
        Child22 child22 = new Child22();
        child22.b = 3;
        my.child22 = child22;

        System.out.println("до клонирования my был 1(i) и 3(b)" + my.i + " " + my.child22.b);
        My my1 = my.clone();
        System.out.println("прошло клонирование");
        my1.i = 2;
        my1.child22.b=4;
        System.out.println("в клон загнали 2(i) и 4(b)" + my1.i + " " + my1.child22.b);
        System.out.println("после клонирования my ( не  изменялся) остался? 1(i) и 3(b)" + my.i + " " + my.child22.b);



        My meSer = new My();


        FileOutputStream fos = new FileOutputStream( "1.bin" );
        ObjectOutputStream oos = new ObjectOutputStream( fos );
        oos.writeObject( my1 );

        FileInputStream fis = new FileInputStream( "1.bin" );
        ObjectInputStream ois = new ObjectInputStream( fis );
        meSer = (My) ois.readObject();
        System.out.println(meSer.i + "  " + meSer.child22.b);

    }

}

class My implements Cloneable, Serializable{
    int i;
    Child22 child22;

    @Override
    protected My clone() throws CloneNotSupportedException {
        My my = (My) super.clone();
        my.child22 = child22.clone();
        return my;
    }
}

class Child22 implements Cloneable, Serializable{
    int b;

    @Override
    protected Child22 clone() throws CloneNotSupportedException {
        return (Child22) super.clone();
    }
}
