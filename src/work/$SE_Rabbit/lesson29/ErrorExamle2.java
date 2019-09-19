package work.$SE_Rabbit.lesson29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ErrorExamle2 {

    FileInputStream fileInputStream = null;
   // Throwable

    public void foo2() {
        try {
            FileInputStream fileInputStream = new FileInputStream( "" );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
