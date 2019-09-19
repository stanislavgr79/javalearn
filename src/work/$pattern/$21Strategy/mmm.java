package work.$pattern.$21Strategy;

import java.io.*;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class mmm {
    public static void main(String[] args) throws Exception {

//        Compressor zip = new Compressor(new ZipCompress());
        File file = new File("new");
        File file1 = new File("README2.zip");
        Path path = Path.of("README.zip");
//        zip.compress(path, file1);

        ZipCompress zipCompress = new ZipCompress();
        zipCompress.zipCompress("README2", "xxx.zip");

//        zipCompress.decompressFile(path);

    }
}


class ZipCompress {

    public void zipCompress(String srcToZip, String destZipFile) throws Exception {
        File file = new File(srcToZip);
        if (!file.isDirectory()) zipFile(srcToZip, destZipFile);
        else {
            zipFolder(srcToZip, destZipFile);
        }

    }
    public void zipFile(String srcToZip, String destZipFile) throws Exception {
        File file = new File(srcToZip);
        try (FileInputStream in = new FileInputStream(srcToZip);
             FileOutputStream fos = new FileOutputStream(destZipFile);
             ZipOutputStream zip = new ZipOutputStream(fos)) {
            byte[] buf = new byte[1024];
            int len;
            zip.putNextEntry(new ZipEntry(file.getName()));
            while ((len = in.read(buf)) > 0) {
                zip.write(buf, 0, len);
            }
        }
    }

    public void zipFolder(String srcToZip, String destZipFile) throws Exception {
        try (OutputStream outputStream = new FileOutputStream(destZipFile);
             ZipOutputStream zip = new ZipOutputStream(outputStream)) {
            addFolderToZip("", srcToZip, zip);
            zip.flush();
        }
    }

    private void addFolderToZip(String path, String srcFolder, ZipOutputStream zip) throws Exception {
        File folder = new File(srcFolder);

        for (String fileName : folder.list()) {
            if (path.equals("")) {
                addFileToZip(folder.getName(), srcFolder + "/" + fileName, zip);
            } else {
                addFileToZip(path + "/" + folder.getName(), srcFolder + "/" + fileName, zip);
            }
        }
    }

    private void addFileToZip(String path, String srcFile, ZipOutputStream zip) throws Exception {
        File folder = new File(srcFile);

        if (folder.isDirectory()) {
            addFolderToZip(path, srcFile, zip);
        } else {
            byte[] buf = new byte[1024];
            int len;
            zip.putNextEntry(new ZipEntry(path + "/" + folder.getName()));

            try (FileInputStream fis = new FileInputStream(srcFile)) {
                while ((len = fis.read(buf)) > 0) {
                    zip.write(buf, 0, len);
                }
            }
        }
    }



//    public void decompressFile(Path gzipFile) {
//      String fileName = System.getProperty("user.dir") + File.separator + file.getName().replaceAll("(\\d+\\.\\w+)", ".zip");
//        Path decompressedFile = null;
//        String fileName = System.getProperty("user.dir") + File.separator + gzipFile.getFileName().toString().replaceAll("(\\d+\\.\\w+)", "");
//
//        try (GZIPInputStream input = new GZIPInputStream(Files.newInputStream(gzipFile))) {
//            decompressedFile = Paths.get(fileName);
//            Files.deleteIfExists(decompressedFile);
//            Files.copy(input, decompressedFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


}