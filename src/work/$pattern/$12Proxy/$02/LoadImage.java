package work.$pattern.$12Proxy.$02;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class LoadImage {

    String loadImage(File file){
        StringBuilder stringBuilder = new StringBuilder();
        try {
            Files.lines(file.toPath()).forEach(o->stringBuilder.append(o+"\n"));
        } catch (IOException e) {
            System.err.println("file not found");;
        }

        return stringBuilder.toString();
    }


}
