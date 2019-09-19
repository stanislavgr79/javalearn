package work.java_learn.$7$IO_NIO.$0000;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class $06_BufferedReader {

    public static void main(String[] args) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();

        ////1111111
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("README2")
                , 4 * 1024);) {
            while (bufferedReader.ready()) {
                stringBuilder.append(bufferedReader.readLine() + "\n");
            }
        }

        ////////2222222222
        try (BufferedReader bufferedReader1 = Files.newBufferedReader(Path.of("README2")
                , StandardCharsets.UTF_8)) {
            String line;
            while ((line = bufferedReader1.readLine()) != null) {
                stringBuilder.append(line + System.lineSeparator());
            }
        }
//        System.out.println(stringBuilder.toString());

        /////333333333
        String string;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("README2")
                , 4 * 1024);) {
            string = bufferedReader.lines().collect(Collectors.joining(System.lineSeparator()));
        }

//        System.out.println(string);


        String result;
        try (BufferedReader reader =
                     new BufferedReader(new StringReader("    Lorem ipsum dolor sit amet."))) {
            do {
                reader.mark(1);
            } while (Character.isWhitespace(reader.read()));

            reader.reset();
            result = reader.readLine();
        }
        System.out.println(result);

    }
}


