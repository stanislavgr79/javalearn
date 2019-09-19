package work.$Z$GREAT.lesson6_anyobj_to_1met;

public class Main {

    public static void main(String[] args) {

        Rectangle r = new Rectangle( 20,40 );
        Triangle t = new Triangle( 40, 80 );
//        double rez1 = anyArea( r );
//
//        System.out.println(rez1);
//
//        anyArea( t );

        System.out.println(anyArea( t ));
//

    }
    static double anyArea (Figure abstractclass){
        return abstractclass.area();
    }

}

abstract class Figure{
   protected double dim1;
   protected double dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    abstract double area();
}

class Rectangle extends Figure{

    Rectangle(double dim1, double dim2) {
        super( dim1, dim2 );
    }

    @Override
    double area() {
        System.out.println("площадь четырех-угольника ");
        return dim1*dim2;
    }
}

class Triangle extends Figure {

    Triangle(double dim1, double dim2) {
        super( dim1, dim2 );
    }

    @Override
    double area() {
        System.out.println("площадь равнобедренного треугольника");
        return dim1*dim2/2;
    }
}
