package work.java_learn.$pattern.$21Strategy;

public class Main {

    public static void main(String[] args) {

        double startPrice = 100;
        Context context = new Context( new HalfPrice() );
        double price = context.getPrice( startPrice );

        context = new Context( new FullPrice(0.7) );
        double price2 = context.getPrice( startPrice );
        System.out.println(price2);

    }
}

interface Strategy{
    double getPrice (double price);
}

class FullPrice implements Strategy{
    double k;

    public FullPrice(double k) {
        this.k = k;
    }

    @Override
    public double getPrice(double price) {
        return price*k;
    }
}

class HalfPrice implements Strategy{

    @Override
    public double getPrice(double price) {
        return price*0.5;
    }
}

class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }


    double getPrice (double price){
        return strategy.getPrice( price );
    }
}