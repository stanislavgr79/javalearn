package work.$thread.$20CyclycBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier( 3, new Run() );
        new Person( cyclicBarrier );
        new Person( cyclicBarrier );
        new Person( cyclicBarrier );



    }

    static class Run extends Thread{
        CyclicBarrier barrier;

        @Override
        public void run() {
            System.out.println("Run is begun");
        }
    }

    static class Person extends Thread{
        CyclicBarrier barrier;

        public Person(CyclicBarrier cyclicBarrier) {
            this.barrier = cyclicBarrier;
            start();
        }

        @Override
        public void run() {
            try {
                barrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
