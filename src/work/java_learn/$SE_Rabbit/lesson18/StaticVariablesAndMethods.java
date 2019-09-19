package work.java_learn.$SE_Rabbit.lesson18;

public class StaticVariablesAndMethods {

    public static int variable;
    public int variable2;

    static {
        variable = foo();
    }

    public static int foo(){
        System.out.println(variable);
        return 1;
    }

    public int show(){
        System.out.println("No");
        foo();
        return 2;
    }

}
