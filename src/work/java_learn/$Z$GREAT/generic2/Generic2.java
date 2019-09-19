package work.java_learn.$Z$GREAT.generic2;

public class Generic2 {

    public static void main(String[] args) {
//        Parent parent = new Parent();
//        GenParent<Parent> genParent= new GenParent<>(parent);
          GenParent<Parent> genParent= new GenParent(new Parent());
//          genParent.setT( new Parent() );
          genParent.aaa();
          genParent.getT().doit();

        GenParent<Child> genParent2= new GenParent(new Child());
//          genParent.setT( new Parent() );
        genParent2.aaa();
        genParent2.getT().doit();
        genParent2.getT().burn();

        GenParent genParent3 = new GenParent(  );
        genParent3=genParent2;
        genParent3.getT().doit();

    }
}

class Parent{
    int i;

    public void doit(){
        System.out.println("parent");}

    public <T> void foo(T t){
        System.out.println(t);
    }
    protected <E> E generic(E e){
        return e;
    }
}
class Child extends Parent{
    public void doit(){
        System.out.println("child");
    }
    public void burn(){
        System.out.println("burn");
    }
}


class GenParent <T extends Parent> {
    int b;
    T t;

    public GenParent(){
    }

    public GenParent(T t) {
        this.t = t;
    }


    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void aaa(){
        t.doit();}
}
//class Child extends GenParent{}
////class Child2 extends GenParent<String>{}
////class Child3<T> extends GenParent<T>{}
//class Child4<T> extends GenParent{}

