package work.Solo.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Files {
    public Files() {
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File dir = new File(".");
        String[] names = dir.list();

        for(int i = 0; i < names.length; ++i) {
            System.out.println(names[i]);
        }

        File file = new File("README2");
        System.out.println(file.length());
        FileInputStream input = new FileInputStream(file);
        int length = input.available();
        System.out.println(length);
        byte[] data = new byte[length];
        input.read(data);
        String text = new String(data);

        System.out.println(text);
        FileOutputStream output = new FileOutputStream(file, true);
        String newText = "<!-- Hello Worlds -->";
        byte[] newTextBytes = newText.getBytes();
        output.write(newTextBytes);
output.close();



    }
}
