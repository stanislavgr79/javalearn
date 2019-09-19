package work.$pattern.$25Busines;

public class Main2 {

    public static void main(String[] args) {


    }
}

interface IdoJob{
    void doSomething();
}

class EJA_service implements IdoJob{
    @Override
    public void doSomething() {
        System.out.println("do EJA");
    }
}

class EJZ_service implements IdoJob{
    @Override
    public void doSomething() {
        System.out.println("do EJZ");
    }
}
