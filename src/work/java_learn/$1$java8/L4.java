package work.java_learn.$1$java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class L4 {

    public static void main(String[] args) throws IOException {


        List list = Files.readAllLines(Paths.get("D:\\text.txt"));
//        Integer result = list.stream()
//                .map(srt -> Arrays.asList(srt.split(" ")).size())
//                .collect(Collectors.toList())
//                .stream()
//                .reduce(0, (a, b) -> a + b);


        long wordCount =
                Files.lines(Paths.get("sample.txt"))
                        .map(line -> line.split("\\s+"))
                        .distinct()
                        .count();
}

}