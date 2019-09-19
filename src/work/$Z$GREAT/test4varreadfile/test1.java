package work.$Z$GREAT.test4varreadfile;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class test1 {

    public static void main(String[] args) throws Exception {

        DataInputStream dis = new DataInputStream(new FileInputStream( "README2" ) );
        byte [] buffer = new byte[dis.available()];
        while (dis.available() != 0) {
            int count = dis.read( buffer );
            if (count> 0){
                System.out.println( buffer );
            }
        }
    }
}
