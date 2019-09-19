package work.$4$Network.$1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(  );
        try(socket){
            socket.connect( new InetSocketAddress( "localhost", 8189 ), 2000 );
            Scanner scanner = new Scanner( socket.getInputStream() );
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
    }
}
