package work.$thread.$16ShedulerExecuter;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.schedule( new MyThread(),3, TimeUnit.SECONDS  );
        scheduledExecutorService.shutdown();

    }

    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println(1);
        }
    }
}
