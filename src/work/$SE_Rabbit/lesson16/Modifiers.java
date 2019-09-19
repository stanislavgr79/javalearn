package work.$SE_Rabbit.lesson16;

// public private protected default
public class Modifiers {

    private String name;

    public String getName() {
        return name;}

    public Modifiers(){}

    public static void foo(){


    }

    public void show(){Modifiers.foo();}

    void SecondClass () {
        Modifiers modifiers = new Modifiers();
        modifiers.name = "";
    }
}
