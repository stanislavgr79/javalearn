package work.java_learn.$7$IO_NIO.$0000;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class $10_CopyFromURL {

    public static void main(String[] args) throws IOException {

        URLConnection urlConnection = new URL("https://search.maven.org/classic/remotecontent?filepath=net/sf/jmimemagic/jmimemagic/0.1.5/jmimemagic-0.1.5.jar").openConnection();
        long lenght = urlConnection.getContentLengthLong();
        File file = new File("5.jar");

        URL url = new URL("https://search.maven.org/classic/remotecontent?filepath=net/sf/jmimemagic/jmimemagic/0.1.5/jmimemagic-0.1.5.jar");

        down(url, file);

    }

    public static void down(URL url, File file) throws IOException {
            HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
            long inetFileSize = httpConnection.getContentLengthLong();
            long existingFileSize = file.length();

            if (existingFileSize < inetFileSize) {
                down1(url, file, existingFileSize);
            }
    }

    public static void down1(URL url, File file, Long n ) throws IOException {
        try (BufferedInputStream bufferedInputStream = new
                BufferedInputStream(url.openStream(), 8 * 1024);
             FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        ) {
            bufferedInputStream.skip(n);
            byte dataBuffer[] = new byte[8 * 1024];
            int bytesRead;
            while ((bytesRead = bufferedInputStream.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        }
        return;
    }

    public static void down2(URLConnection urlConnection, File FILE_NAME) throws IOException {
        try (InputStream in = new BufferedInputStream(urlConnection.getInputStream())) {
            Files.copy(in, Paths.get(String.valueOf(FILE_NAME)), StandardCopyOption.REPLACE_EXISTING);
        }
    }

    public static void down3(URLConnection url, File FILE_NAME) throws IOException {
        try (ReadableByteChannel readableByteChannel = Channels.newChannel(url.getInputStream());
             FileOutputStream fos = new FileOutputStream(FILE_NAME);
             FileChannel fileChannelFOS = fos.getChannel();
        ) {
            fileChannelFOS.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
        }
    }

    public static void down4(URL url, File FILE_NAME) throws IOException {
        FileUtils.copyURLToFile(url, FILE_NAME);
    }
}
