package work.$thread.$6atomar;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

//    использование concurrence package

    static AtomicInteger i = new AtomicInteger( 0 );

    public static void main(String[] args) throws InterruptedException {

        for(int k=0; k<10_000; k++){
            new MyThread().start();
        }
        Thread.sleep( 2000 );
        System.out.println(i);

    }

    static class MyThread extends Thread{
        @Override
        public void run() {
           i.incrementAndGet();
        }
    }
}
