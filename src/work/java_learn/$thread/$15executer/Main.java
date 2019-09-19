package work.java_learn.$thread.$15executer;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
// фиксированный пул потоков
        ExecutorService executorService = Executors.newFixedThreadPool( 2 );
        executorService.submit( new MyRunnable() );
        System.out.println(executorService.submit( new Callable1() ).get());
        executorService.shutdown();

    }

    static class MyRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println(1);
        }
    }

    static class Callable1 implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
           return 2;
        }
    }
}
