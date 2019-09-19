package work.java_learn.$pattern.COMPLITE.$10Fasade;


import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        Fasad fasad = new Fasad();

        System.out.println(fasad.readFile("RRR"));

        List<String> list = Files.readAllLines( Paths.get("README2") );
        List<String> list2 = new ArrayList<>(  );
        Files.readString( Paths.get( "README2" ) ).lines().forEach( o-> list2.add( o ) );
        System.out.println(list.size() + " " + list2.size());


        StringBuffer stringBuffer = new StringBuffer();
        Files.readString( Paths.get( "README2" ) ).lines().forEach( o-> stringBuffer.append(o + "\n") );
        System.out.println(stringBuffer.toString());


    }
}

class Fasad {
    StringBuffer text = new StringBuffer();

    String readFile(String fileName) {
        try {
            readByte(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text.toString();
    }

    void readByte(String fileName) throws IOException {
        try (FileInputStream input = new FileInputStream(fileName);) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] data = new byte[32];
            int length;
            while ((length = input.read(data)) != -1) {
                baos.write(data, 0, length);
                text.append(baos.toString(StandardCharsets.UTF_8));
                baos.reset();
            }
        }
    }
}
