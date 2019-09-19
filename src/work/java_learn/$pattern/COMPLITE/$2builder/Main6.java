package work.java_learn.$pattern.COMPLITE.$2builder;

public class Main6 {

    public static void main(String[] args) {

        Director director = new Director();
        PizzaBuilder pizzaBuilder = new PizzaNY();
        director.setPizzaBuilder(pizzaBuilder);
        director.createPizza();
        Pizza pizza = director.getPizza();
        System.out.println(pizza);

    }
}

class Pizza{
    private int x;
    private String y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(String y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "x=" + x +
                ", y='" + y + '\'' +
                '}';
    }
}

abstract class PizzaBuilder{
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza() {
        this.pizza = new Pizza();
    }

    abstract void giveMeX();
    abstract void giveMeY();
}

class PizzaNY extends PizzaBuilder{

    @Override
    void giveMeX() {
        pizza.setX(5);
    }

    @Override
    void giveMeY() {
        pizza.setY("NY");
    }
}

class Director{
    private PizzaBuilder pizzaBuilder;

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public void createPizza(){
        pizzaBuilder.setPizza();
        pizzaBuilder.giveMeX();
        pizzaBuilder.giveMeY();
    }


}