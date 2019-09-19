package work.java_learn.$thread.$19Exchenger;

import java.util.concurrent.Exchanger;

public class Main {

    public static void main(String[] args) {

        Exchanger<String> exchanger = new Exchanger();

        new Mike( exchanger );
        new Anket( exchanger );

    }

    static class Mike extends Thread {
        Exchanger<String> exchanger;

        public Mike(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {
            try {
                exchanger.exchange("I am Mike");
                sleep( 3000 );
                exchanger.exchange("I am 20 years");
                sleep( 1000 );
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("I was sleep 1000");
        }
    }

    static class Anket extends Thread{
        Exchanger exchanger;

        public Anket(Exchanger exchanger) {
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {
            try {
                System.out.println( exchanger.exchange( null ));  // ожидает получения
                System.out.println( exchanger.exchange( null ));  // и получает
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
