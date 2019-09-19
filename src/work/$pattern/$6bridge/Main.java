package work.$pattern.$6bridge;

public class Main {

    public static void main(String[] args) {
       Red red = new Red();
       red.setI(5);

       Circle circle = new Circle();

       Factor<Circle, Red> factor1 = new Factor<>(circle, red);
       factor1.getColor().methodColor();
       System.out.println(factor1.getColor().getI());
    }
}

class Factor<S extends Shape, C extends Color>{
    private S shape;
    private C color;

    public Factor(S shape, C color) {
        this.shape = shape;
        this.color = color;
    }

    public S getShape() {
        return shape;
    }

    public void setShape(S shape) {
        this.shape = shape;
    }

    public C getColor() {
        return color;
    }

    public void setColor(C color) {
        this.color = color;
    }
}
interface IShape {
    void fromIShape();
}

abstract class Shape {
    IShape iShape;

    public abstract void methodAb();
}

class Circle extends Shape{


    @Override
    public void methodAb() {
        iShape.fromIShape();
    }

}


abstract class Color implements IShape{

    abstract void methodColor();
}

class Red extends Color{
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public void fromIShape() {
        System.out.println( "is shapei realize in Red" );
    }

    @Override
    void methodColor() {
        System.out.println("Red");
    }
}

class Black extends Color{
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public void fromIShape() {
        System.out.println( "is shapei realize in Black" );
    }

    @Override
    void methodColor() {
        System.out.println("Black");
    }
}



