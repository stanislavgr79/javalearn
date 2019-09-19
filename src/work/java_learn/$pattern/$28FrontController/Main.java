package work.java_learn.$pattern.$28FrontController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner( System.in )) {
            do {
                String nextLine = scanner.nextLine();
                if(nextLine.equals( "exit" )){break;}
                new Thread() {
                    @Override
                    public void run() {
                        new DispatcherServlet().process( nextLine );
                    }
                }.start();
            } while (scanner.hasNext());
        }
    }
}


class DispatcherServlet {
    void process(String url) {
        switch (url) {
            case "home":
                new HomeController().show();
                break;
            case "user":
                new UserController().show();
                break;
            default:
                new DefaultController().show();
        }
    }
}

class HomeController {
    void show() {
        System.out.println( "home" );
    }
}

class UserController {
    void show() {
        System.out.println( "user" );
    }
}

class DefaultController {
    void show() {
        System.out.println( "err" );
    }
}