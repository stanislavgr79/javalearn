package work.java_learn.$thread.$18CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch( 3 );

        new Work( countDownLatch ).start();
        new Work( countDownLatch ).start();
        new Work( countDownLatch ).start();

        countDownLatch.await();
        System.out.println("all jobs down");

    }
}

class Work extends Thread{
    CountDownLatch countDownLatch;

    public Work(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            sleep( 3000 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("work complite");
        try {
            sleep( 1000 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countDownLatch.countDown();
    }
}