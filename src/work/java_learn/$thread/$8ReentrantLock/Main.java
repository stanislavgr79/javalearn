package work.java_learn.$thread.$8ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Resources resources = new Resources();
        resources.i = 5;

        MyThread myThread1 = new MyThread();
        myThread1.setName("o");
        MyThread myThread2 = new MyThread();

        myThread1.setResources(resources); // правильно засетать рес в тред
        myThread2.setResources(resources); // правильно засетать рес в тред
//        myThread2.resources=resources;

        myThread1.start();
        myThread2.start();
        myThread1.join(); // обязательно  - дождемся и чтобы не прервался
// синхроназ нужен для длинного кода
        myThread2.join();


//        System.out.println(myThread1.resources.i);
//        System.out.println(myThread2.resources.getI());
        System.out.println(resources.i);
    }
}

class MyThread extends Thread {
    Resources resources;

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    @Override
    public void run() {
        resources.methodChangeI();
    }
}

class Resources {
    int i;

    Lock lock = new ReentrantLock();

//    public int getI() {
//        return i;
//    }

    public synchronized void methodChangeI() {
        lock.lock();
        synchronized (this) {
//           // методы должны быть синхронизированы . конкурентность потоков
//            разделить доступ между доступ к общим ресурсам и нет . сделать внутри частности
        }

        int i = this.i;
//        if(Thread.currentThread().getName().equals( "o" )){
//            Thread.yield(); // поток возвращается в пул
//        }
        i++;
        this.i = i;
        lock.unlock();
    }
}