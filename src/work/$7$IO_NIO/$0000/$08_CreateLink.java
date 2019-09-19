package work.$7$IO_NIO.$0000;

import java.io.*;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class $08_CreateLink {

    public static void main(String[] args) throws IOException {

        Path path = new File("file1.txt").toPath();
        String mime = Files.probeContentType(path);
        System.out.println(mime);

        File file = new File("file1.txt");
        String mime2 = URLConnection.guessContentTypeFromName(file.getName());
        System.out.println(mime2);

        Path path2 = new File("README2").toPath();
        Path link = Paths.get(".", "link.lnk");
        Files.createSymbolicLink(link, path2);
    }
}
