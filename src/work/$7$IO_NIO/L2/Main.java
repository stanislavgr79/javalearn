package work.$7$IO_NIO.L2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) throws IOException {

        String str = "Hello";
        String sep = File.separator;

        File file = new File("test321.txt");

        try (FileOutputStream fis = new FileOutputStream(file);) {
            fis.write(str.getBytes());
            fis.flush();
        }

        try (FileInputStream fis = new FileInputStream(file);) {
            byte[] bytes = new byte[fis.available()];
            fis.read(bytes);
//            System.out.println(new String(bytes));
        }

        List<String> list = Files.readAllLines(Path.of("test321.txt"));

        String text = "World";

        String text2 = "Hello world!";
        byte[] buffer2 = text2.getBytes();

        try (InputStream in = new ByteArrayInputStream(buffer2);
             BufferedInputStream bis = new BufferedInputStream(in);
             FileOutputStream fos = new FileOutputStream("hello.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
//            int c;
//            while((c=bis.read())!=-1){
//                bos.write(c);
//            }
            bis.transferTo(bos);
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("notes4.txt"))) {
            String text33 = "Hello  World!\nHey! Teachers! Leave them kids alone.";
            bw.write(text33);
        }

        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("notes4.txt"))) {
            //чтение построчно
//
            String s;
            while ((s = br.readLine()) != null) {

//                System.err.println(s);
                list3.add(s);
            }
            list2 = br.lines().collect(Collectors.toList());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        list2.forEach(o -> System.out.println(o));
        list3.forEach(o -> System.out.println(o));

    }

}

