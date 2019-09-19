package work.java_learn.$thread.$3synhronization;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Resources resources = new Resources();
        resources.setI( 5 );

        MyThread myThread1 = new MyThread();
        myThread1.setName( "o" );
        MyThread myThread2 = new MyThread();

        myThread1.setResources( resources ); // правильно засетать рес в тред
        myThread2.setResources( resources ); // правильно засетать рес в тред
//        myThread2.resources=resources;


//        myThread1.join(); // обязательно  - дождемся и чтобы не прервался синхронайз нужен для длинного кода
//        myThread2.join();

        System.out.println(resources.getI());
    }
}

class MyThread extends Thread{

    Resources resources;

    public void setResources(Resources resources) {
        this.resources = resources;
        start();
    }

    @Override
    public void run() {
        resources.methodChangeI();
    }
}

class Resources {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

//    }

    public  synchronized void methodChangeI(){
        synchronized (this){
//           // методы должны быть синхронизированы . конкурентность потоков
//            разделить доступ между доступ к общим ресурсам и нет . сделать внутри частности
        }

        int i =this.i;
//        if(Thread.currentThread().getName().equals( "o" )){
//            Thread.yield(); // поток возвращается в пул
//        }
        i++;
        this.i=i;
    }
}