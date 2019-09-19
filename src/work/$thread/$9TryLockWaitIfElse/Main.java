package work.$thread.$9TryLockWaitIfElse;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
//        System.out.println(lock.tryLock());
        new Thread0().start();
        new Thread1().start();

    }

    static class Thread0 extends Thread {
        @Override
        public void run() {
            lock.lock();
            System.out.println( getName() + " start work" );
            try {
                sleep( 1 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println( getName() + " stop work" );
            lock.unlock();
            System.out.println( getName() + " lock in unlock" + "thread0 finish");
        }
    }

    static class Thread1 extends Thread {
        @Override
        public void run() {
            System.out.println( getName() + " start work" );
            while (true) {

                if (lock.tryLock()) {
                    System.out.println( getName() + " working" );
                    break;
                }else {
                    System.out.println(getName() + " yps...i am waiting");

                }

            }
            System.out.println("thread1 finish");

        }

    }
}