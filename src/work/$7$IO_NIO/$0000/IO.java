package work.$7$IO_NIO.$0000;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class IO {

    public static void main(String[] args) throws IOException {

        File file = new File("README2");
        System.out.println(read6(file));

    }

    // Scanner
    public static void read1(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        List<String> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        String string;
        while (scanner.hasNextLine()) {
            string = scanner.nextLine();
            list.add(string);
            stringBuilder.append(string + System.lineSeparator());
        }
        scanner.close();
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        list.forEach(System.out::println);
        string = stringBuilder.toString();
        System.out.println(string);
    }

    // BEST TO STRING
    public static String read2(File file) throws IOException {

        try (InputStream is = new FileInputStream(file)) {

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) != -1) {
                baos.write(buffer, 0, length);
            }
            // StandardCharsets.UTF_8.name() > JDK 7
            return baos.toString(StandardCharsets.UTF_8);
        }

    }

    public static StringBuilder read3(File file) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file)
                , 4 * 1024);) {
            while (bufferedReader.ready()) {
                stringBuilder.append(bufferedReader.readLine() + "\n");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder;
    }

    public static String read4(File file) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader1 =
                     Files.newBufferedReader((Path.of(file.getName())), StandardCharsets.UTF_8)) {
            String line;
            while ((line = bufferedReader1.readLine()) != null) {
                stringBuilder.append(line + System.lineSeparator());
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }


    public static String read5(File file) throws IOException {
        String string;

//            try (InputStream fis = new FileInputStream(file);
//                 InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
//                 BufferedReader bufferedReader = new BufferedReader(isr, 8*1024)){

        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader(file.getName(), StandardCharsets.UTF_8), 4 * 1024)) {
            string = bufferedReader.lines().collect(Collectors.joining(System.lineSeparator()));
        }
        return string;
    }

    public static String read6(File file) throws IOException {
        byte[] bytes = Files.readAllBytes(file.toPath());
        String s = new String(bytes, StandardCharsets.UTF_8);
        return s;
    }
}


//    List<String> list = Files.readAllLines(mypath, coding);
//    InputStream inputStream = urlConnection.getInputStream();
//    InputStreamReader isr = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
//    BufferedReader bufferedReader = new BufferedReader(isr, 8 * 1024);
//
//    OutputStream outputStream = new FileOutputStream(new File("111.html"));
//    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
//    BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter, 4 * 1024);