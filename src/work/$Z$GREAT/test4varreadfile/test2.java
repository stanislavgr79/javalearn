package work.$Z$GREAT.test4varreadfile;

import java.io.FileInputStream;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner( new FileInputStream( "README2" ) );// new File("")
        while (scanner.hasNextLine()) {
            System.out.println( scanner.nextLine() );
        }
    }
}

