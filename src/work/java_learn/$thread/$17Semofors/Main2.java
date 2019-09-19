package work.java_learn.$thread.$17Semofors;

import java.sql.Time;
import java.util.concurrent.Semaphore;

public class Main2 {

    public static void main(String[] args) throws InterruptedException {

        Semaphore table = new Semaphore(1);

//        SingleElementBuffer sb = new SingleElementBuffer();
//        Producer producer = new Producer(100, 1000, sb);
//        Consumer consumer = new Consumer(sb);
//        new Thread(producer).start();
//        new Thread(consumer).start();
//        Thread.sleep(5000);
        System.out.println(new Time(System.currentTimeMillis()).toLocalTime());
    }
}

class SingleElementBuffer {
    private Integer elem = null;

    public synchronized void put (int newElem) throws InterruptedException {
        while (this.elem != null){
            this.wait();
        }
        this.elem = newElem;
        this.notifyAll();
    }

    public synchronized int get() throws InterruptedException {
        while (elem == null){
            this.wait();
        }
        Integer result = this.elem;
        this.elem = null;
        this.notifyAll();
        return result;
    }

}

class Producer implements Runnable{
private int startValue;
private final int PERIOD;
private final SingleElementBuffer BUFFER;
Semaphore table;

    public Producer(int startValue, int PERIOD, SingleElementBuffer BUFFER) {
        this.startValue = startValue;
        this.PERIOD = PERIOD;
        this.BUFFER = BUFFER;
    }

    @Override
    public void run() {
        while (true){
            System.out.println(startValue + " producer");
            try {
                BUFFER.put(startValue++);
                Thread.sleep(PERIOD);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " stopped");
                break;
            }
        }
    }
}
class Consumer implements Runnable{
private final SingleElementBuffer BUFFER;

    public Consumer(SingleElementBuffer BUFFER) {
        this.BUFFER = BUFFER;
    }

    @Override
    public void run() {
        while (true){
            try {
                Integer elem = BUFFER.get();
                System.out.println(elem + " consumer");
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " stopped");
                return;
            }
        }
    }
}