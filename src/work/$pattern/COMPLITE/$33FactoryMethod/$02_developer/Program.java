package work.$pattern.COMPLITE.$33FactoryMethod.$02_developer;

public class Program {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = new JavaDeveloperFactory();
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();

    }

}
