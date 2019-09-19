package work.$7$IO_NIO.$0000;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class $02_FileChannelRandom {

    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        try (
                RandomAccessFile randomAccessFile = new RandomAccessFile("README2", "r");
        FileOutputStream fileOutputStream = new FileOutputStream(new File("README2"));
                FileChannel fileChannel1 = randomAccessFile.getChannel();
        FileChannel channelOutput = fileOutputStream.getChannel();
        ) {


            int buffersize = 4 * 1024;
            if (buffersize > fileChannel1.size()) {
                buffersize = (int) fileChannel1.size();
            }
            ByteBuffer byteBuffer = ByteBuffer.allocate(buffersize);


            ByteArrayOutputStream out = new ByteArrayOutputStream();
            while (fileChannel1.read(byteBuffer) > 0) {
                out.write(byteBuffer.array(), 0, byteBuffer.position());
                stringBuilder.append(new String(out.toByteArray(), StandardCharsets.UTF_8));

                byteBuffer.clear();

            }
            System.out.println(stringBuilder.toString());

            ByteBuffer buff = ByteBuffer.wrap(stringBuilder.toString().getBytes(StandardCharsets.UTF_8));
            channelOutput.write(buff);
            buff.flip();
            System.out.println("!!!!!!!!!!");
            File file = new File("README2");
            System.out.println(fromInput(file));

        }
    }

    public static String fromInput(File file) throws IOException {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        FileChannel fileChannel1 = randomAccessFile.getChannel();) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int buffersize = 4 * 1024;
            if (buffersize > fileChannel1.size()) {
                buffersize = (int) fileChannel1.size();
            }
            ByteBuffer byteBuffer = ByteBuffer.allocate(buffersize);

            while (fileChannel1.read(byteBuffer) > 0) {
                out.write(byteBuffer.array(), 0, byteBuffer.position());
//                stringBuilder.append(new String(out.toByteArray(), StandardCharsets.UTF_8));
                byteBuffer.clear();
            }
            return out.toString(StandardCharsets.UTF_8);
        }
    }
}

