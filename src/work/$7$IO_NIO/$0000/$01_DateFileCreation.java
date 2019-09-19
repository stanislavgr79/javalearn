package work.$7$IO_NIO.$0000;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Date;

public class $01_DateFileCreation {

    public static void main(String[] args) throws IOException {


        FileTime creationTime = (FileTime) Files.getAttribute(Path.of("file1.txt"),"creationTime");
        System.out.println(new Date(creationTime.toMillis()));


        Path path = Paths.get("file1.txt");
        try {
            BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
            FileTime fileTime = attr.creationTime();
            System.out.println(new Date(fileTime.toMillis()));
        } catch (IOException ex) {
            // handle exception
        }


    }


}

