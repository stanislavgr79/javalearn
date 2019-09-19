package work.java_learn.$Z$GREAT.test4varreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class test4 {
    public static void main(String[] args) throws IOException {
        Files.lines( Paths.get("README2")).forEach( System.out::println );
    }
}
