package work.$7$IO_NIO.$0000;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

public class $00_CreateCopy {

    public static void main(String[] args) throws IOException {


        String separator = File.separator;
        String separator2 = System.getProperty("file.separator");
        String path = "file1.txt";
        File file = new File(path);

        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("failed create file ");
            e.printStackTrace();
        }

        String text = "Hello";
        byte[] bytes = text.getBytes();

        try (OutputStream os = new FileOutputStream(file);
             OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
             BufferedWriter br = new BufferedWriter(osw, 4 * 1024);
        ) {
            br.write(text);
            br.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Files.readAllLines(Paths.get(path)).forEach(o -> System.out.println(o));


        String newFileName = "file2.txt";
        File file1 = new File("new" + File.separator + newFileName);
//        file.renameTo(file1);

//        file.delete();
        File file2 = File.createTempFile("qwe", null, null);
        file2.deleteOnExit();
        System.out.println(file.length());

        System.out.println(new Date(file.lastModified()));

        copy1(file, file1);
//        copyFileUsingChannel(file, file1);

    }

    public static void copy1(File src, File dst) throws IOException {

        try (FileInputStream fis = new FileInputStream(src);
             FileChannel fileChannel = fis.getChannel();
             FileOutputStream fos = new FileOutputStream(dst)) {

            int buffSize = 4*1024;
            if(buffSize>fileChannel.size()){
                buffSize=(int) fileChannel.size();
            }
            ByteBuffer byteBuffer = ByteBuffer.allocate(buffSize);

            while (fileChannel.read(byteBuffer)>0) {
                fos.write(byteBuffer.array(), 0 , byteBuffer.position());
                fos.flush();
                byteBuffer.clear();
            }

//            byte[] buffer = new byte[1024];
//            int bytesRead;
//            while ((bytesRead = fis.read(buffer, 0, 1024)) > 0) {
//                fos.write(buffer, 0, bytesRead);
//            }
        }
    }


    private static void copyFileUsingChannel(File source, File dest) throws IOException {
        try (FileChannel sourceChannel = new FileInputStream(source).getChannel();
             FileChannel destChannel =  new FileOutputStream(dest).getChannel();) {

            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());

        }
    }



}
