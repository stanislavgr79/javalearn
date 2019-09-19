package work.java_learn.$4$Network.$2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        try(ServerSocket serverSocket = new ServerSocket( 8189 );
            Socket socket = serverSocket.accept()){
//            InputStream inputStream = socket.getInputStream();
            Scanner scanner = new Scanner( socket.getInputStream() );
//            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter( socket.getOutputStream() , true);
            printWriter.println( "hello" );
            while (scanner.hasNextLine()){
                String str = scanner.nextLine();
                printWriter.println( "you send " + str );
                System.out.println(str);
                if(str.equals( "exit" )){
                    break;
                }
            }
        }
    }
}
