package work.$7$IO_NIO.$0000;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class $07_ReadStream {

    public $07_ReadStream() throws IOException {

        URLConnection urlConnection = new URL("http://google.com/").openConnection();

        try (
                InputStream inputStream = urlConnection.getInputStream();
                InputStreamReader isr = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
                BufferedReader bufferedReader = new BufferedReader(isr, 8 * 1024);

                OutputStream outputStream = new FileOutputStream(new File("111.html"));
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter, 4 * 1024);
        ){

            while (bufferedReader.ready()) {
                bufferedWriter.write(bufferedReader.read());
                bufferedWriter.flush();
            }
        }

        List<String> list = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("README2"))) {
            while (bufferedReader.ready()){
                list.add(bufferedReader.readLine());
            }
        }

        list.stream().forEach(o-> System.out.println(o));




    }

    public static void main(String[] args) throws IOException {
        String file = "README2";
        List<String> list = readUsingBufferedReader(file);
//        List<String> list = readFromFileNIO(file, StandardCharsets.UTF_8);
//        List<String> list = readFromFileScanner(file);
        list.forEach(o-> System.err.println(o));

    }

    public static List<String> readFromFileNIO (String path, Charset coding) throws IOException {
        Path mypath = Paths.get(path);
        byte [] bytes = Files.readAllBytes(mypath);
        List<String> list = Files.readAllLines(mypath, coding);
        String s = new String(bytes, StandardCharsets.UTF_8);
        return list;
    }

    public static List<String> readFromFileScanner (String path) throws IOException {
        Path mypath = Paths.get(path);
        Scanner scanner = new Scanner(mypath);
        List<String> list = new ArrayList<>();
        while (scanner.hasNextLine()){
            list.add(scanner.nextLine());
        }
        return list;
    }

    private static List<String> readUsingBufferedReader(String path)  {
        List<String> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        File file = new File(path);
        try (InputStream fis = new FileInputStream(file);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader bufferedReader = new BufferedReader(isr, 8*1024)){

            // не поддерживает кодировку FileReader
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path), 4*1024)){

            while (bufferedReader.ready()) {
                list.add(bufferedReader.readLine());
            }

            while (bufferedReader.ready()) {
                stringBuilder.append(bufferedReader.readLine() + "\n");
            }
//            System.out.println(stringBuilder);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }




}



