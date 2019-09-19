package work.$Z$GREAT.test4varreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class test3 {

    public static void main(String[] args) throws IOException {
        List<String> list= Files.readAllLines( Paths.get("README2"));
        for (String item: list) {
            System.out.println(item);
        }
    }
}
