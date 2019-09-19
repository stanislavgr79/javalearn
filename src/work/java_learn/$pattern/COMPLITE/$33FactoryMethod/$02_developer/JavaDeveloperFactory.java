package work.java_learn.$pattern.COMPLITE.$33FactoryMethod.$02_developer;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDepeloperImp();
    }
}
