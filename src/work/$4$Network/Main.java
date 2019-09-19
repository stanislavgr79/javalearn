package work.$4$Network;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        URLConnection urlConnection = new URL( "http://google.com/" ).openConnection();
        Scanner scanner = new Scanner( urlConnection.getInputStream() );
        while (scanner.hasNextLine()){
            scanner.useDelimiter("\\Z");
            File file = new File( "11.html");
            FileWriter fileWriter = new FileWriter(file ,true );
            fileWriter.write( scanner.nextLine() );
            fileWriter.flush();
            fileWriter.write( "\n" );
            fileWriter.flush();
            OutputStream a = new FileOutputStream(file,true);


        }
    }
}
