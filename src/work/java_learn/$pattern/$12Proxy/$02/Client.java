package work.java_learn.$pattern.$12Proxy.$02;

import java.io.File;

public class Client {

    public static void main(String[] args) {
        File file = new File("RRR");
//        ImageImp di = new ImageImp(file);
//        System.out.println(di.getFile().length());
//        di.display();

        Proxy proxy = new Proxy(file);
        proxy.display();
    }


}
