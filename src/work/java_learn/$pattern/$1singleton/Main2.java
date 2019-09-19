package work.java_learn.$pattern.$1singleton;

public class Main2 {

    public static void main(String[] args) {


    }
}

class Car {

    private static final Car INSTANCE = new Car();

    private Car(){
    }

    public static Car getInstance(){
        return INSTANCE;
    }
}
