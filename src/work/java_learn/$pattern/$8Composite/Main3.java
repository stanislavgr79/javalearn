package work.java_learn.$pattern.$8Composite;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {

        Shape square1 = new Square();
        Shape square2 = new Square();
        Shape triangle1 = new Triangle();

        Shape square3 = new Square();
        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape circle3 = new Circle();

        Shape triangle2 = new Triangle();
        Shape triangle3 = new Triangle();

        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.addComponents(square1);
        composite1.addComponents(square2);
        composite1.addComponents(circle1);
        composite1.addComponents(circle2);

        composite2.addComponents(square3);
        composite2.addComponents(triangle1);
        composite2.addComponents(triangle2);
        composite2.addComponents(triangle3);

        composite.addComponents(composite1);
        composite.addComponents(composite2);

        composite.draw();



    }
}

interface Shape{
    void draw();
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("square");
    }
}
class Triangle implements Shape{

    @Override
    public void draw() {
        System.out.println("triangle");
    }
}
class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("circle");
    }
}

class Composite implements Shape{
    private final List<Shape> components = new ArrayList<>();

    public Composite() {
    }

    @Override
    public void draw() {
        for(Shape components: components){
            components.draw();
        };
    }

    public void addComponents(Shape shape){
        components.add(shape);
    }

    public void removeComponents(Shape shape){
        components.removeIf(shape1 -> shape1.equals(shape));
    }

}