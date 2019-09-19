package work.java_learn.$thread.$2lifeCicleThread;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        MyThread myThread1 = new MyThread();
        myThread1.start();
        Thread thread = Thread.currentThread();
//
//        myThread1.join(); // дождаться выполнения других потоков до dead или sleep wait
//        myThread1.setPriority( Thread.MIN_PRIORITY );
//        Thread.currentThread().interrupt(); // выкинуть в runnable

        System.out.println("$main$ " + Thread.currentThread().getName());
        System.out.println("$main$ 2" + Thread.currentThread().getName());


    }
}
// Thread.  вызов статических методов на текущий поток

class MyThread extends Thread{
    @Override
    public void run() {
//        try {
//            Thread.sleep( 1000 ); // потом попадает в runnable
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Thread.currentThread().setPriority( Thread.MAX_PRIORITY );
//        Thread.yield(); // просит шедулер в пуле потоков приоритет в low - нет гарантии

        System.out.println("$thread-0$ " + Thread.currentThread().getName());

        System.out.println("last");
    }
}