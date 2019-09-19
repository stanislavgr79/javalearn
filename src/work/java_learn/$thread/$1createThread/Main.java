package work.java_learn.$thread.$1createThread;

public class Main {

    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
////        myThread.setName( "one" );
//        myThread.start();
////        new MyThread().start();
        System.out.println("name current main (ZERO): " + Thread.currentThread().getName());
//
        Runnable1 runnable = new Runnable1();
        Thread thread1 = new Thread( runnable );
//        Thread thread2 = new Thread( new Runnable1() );
        thread1.start();
//        thread2.start();
//        Thread thread = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName());;
//        });
//        thread.start();

    }
}

class MyThread extends Thread{
    @Override
    public void run() {
//        Thread.currentThread().setName( "one" );
//        System.out.println("This is a new Thread " + Thread.currentThread().getName());
        for(int i=0; i<200; i++){
            System.out.println("Current thread :" + Thread.currentThread().getName() + " i " + i++);
        }
    }
}

class Runnable1 implements Runnable{

    @Override
    public void run() {
        Thread.currentThread().setName( "two" );
        System.out.println("This is a new Thread " + Thread.currentThread().getName());
        try {
            printC();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void printC () throws InterruptedException {
        for (int y=0; y<3; y++) {
//            Thread thread1 = new Thread(a);
//            Thread thread2 = new Thread(b);
//            thread1.start();
//            thread2.start();
//            thread1.join();
//            thread2.join();
            System.out.println("C" + Thread.currentThread().getName());
        }
    }
}