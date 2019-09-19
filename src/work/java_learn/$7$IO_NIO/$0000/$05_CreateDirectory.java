package work.java_learn.$7$IO_NIO.$0000;

import java.io.File;

public class $05_CreateDirectory {
    private static final File TEMP_DIRECTORY = new File(System.getProperty("java.io.tmpdir"));

    public static void main(String[] args) {

//        File file = new File("QWE");
//        file.mkdir();
//        file.delete();

        File newDirectory = new File(TEMP_DIRECTORY,"new_Directory");
        newDirectory.mkdir();

    }
}
