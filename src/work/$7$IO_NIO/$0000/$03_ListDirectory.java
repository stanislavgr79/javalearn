package work.$7$IO_NIO.$0000;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class $03_ListDirectory {
    public static void main(String[] args) throws IOException {

        File dir = new File(".");
        Path path = Path.of(".");
        String str = ".";
        String[] list = dir.list();
//        Stream.of(list).forEach(o-> System.out.println(o));

        Set<String> dir2 = Stream.of(new File(".").listFiles()).
                filter(file -> file.isDirectory()).map(File::getName).collect(Collectors.toSet());
//        dir2.forEach(o-> System.out.println(o));


        Set<String> dir3 = new HashSet<>();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path p : stream) {
                if (Files.isDirectory(p)) {
                    dir3.add(p.getFileName()
                            .toString());
                }
            }
        }
        dir3.forEach(o -> System.out.println(o));

        SortedSet sortedSet = new TreeSet();
        sortedSet.addAll(dir3);
        sortedSet.iterator().forEachRemaining(System.out::println);


        FilenameFilter filter = (dirr, name) -> name.endsWith(".txt") | name.startsWith("l");

        File directory = new File(".");
        String[] actualFiles = directory.list(filter);
        for (String s : actualFiles) {
            System.out.println(s);
        }

        Path startingDir = Paths.get("pathToDir");
        FileVisitor visitor = new FileVisitor() {
            @Override
            public FileVisitResult preVisitDirectory(Object o, BasicFileAttributes basicFileAttributes) throws IOException {
                return null;
            }

            @Override
            public FileVisitResult visitFile(Object o, BasicFileAttributes basicFileAttributes) throws IOException {
                return null;
            }

            @Override
            public FileVisitResult visitFileFailed(Object o, IOException e) throws IOException {
                return null;
            }

            @Override
            public FileVisitResult postVisitDirectory(Object o, IOException e) throws IOException {
                return null;
            }
        };
        Files.walkFileTree(startingDir, visitor);

    }
}

