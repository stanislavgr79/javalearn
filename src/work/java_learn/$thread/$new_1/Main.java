package work.java_learn.$thread.$new_1;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        var runnable = new RunnableImpl(3);
        runnable.thread.start();


    }
}

class RunnableImpl implements Runnable{
private int x;
private A a;
private B b;
Thread thread = new Thread(this);

    public RunnableImpl (int x){
        this.x = x;
        a = new A(x);
        b = new B(x);
    }

    @Override
    public void run() {

        try {
            printC();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void printC () throws InterruptedException {
        for (int y=0; y<3; y++) {
            Thread thread1 = new Thread(a);
            Thread thread2 = new Thread(b);
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
            System.out.println("C " + Thread.currentThread().getName());
        }
    }
}

class A implements Runnable{
private int x;
    public A(int x){
        this.x = x;
    }

    @Override
    public void run() {
        printA(x);
    }

    synchronized void printA (int x){
        for(int y = 0; y<x; y++){
            System.out.println("A "  + Thread.currentThread().getName());
        }
    }
}

class B implements Runnable {
private int x;
public B(int x){
    this.x = x;
}

    @Override
    public void run() {
        printB(x);
    }

    synchronized void printB (int x){
        for (int y = 0; y<x; y++){
            System.out.println("B " + Thread.currentThread().getName());
        }
    }
}