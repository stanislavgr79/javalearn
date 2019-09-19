package work.java_learn.$pattern.$19State;

public class Main {

    public static void main(String[] args) {
        Context c1 = new Context( new LoverCase(), "Java" );
        c1.doAction();
//        System.out.println(c1.name);
        c1.setState( new UpperCase());
        c1.doAction();
        System.out.println(c1.name);
        /////////
        System.out.println("!!!!!");

    }
}

interface State{
    void doAction(Context context);
}

class LoverCase implements State{

    @Override
    public void doAction(Context context) {
        System.out.println(context.name.toLowerCase());
    }
}

class UpperCase implements State{

    @Override
    public void doAction(Context context) {
        System.out.println(context.name.toUpperCase());
    }
}

class Context{
    State state;
    String name;

    public Context(State state, String name) {
        this.state = state;
        this.name = name;
    }

    public void setState(State state) {
        this.state = state;
    }

    void doAction(){
        state.doAction( this );
    }
}