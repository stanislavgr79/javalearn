package work.java_learn.$7$IO_NIO.$0000;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import java.io.*;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class $09_EncryptDecrypt {

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {

        String str = "QWERTY";
        SecretKey secretKey1 = KeyGenerator.getInstance("AES").generateKey();

        FileEncrypterDecrypter fileEncrypterDecrypter = new
                FileEncrypterDecrypter("AES/CBC/PKCS5Padding" );

        fileEncrypterDecrypter.encrypt(str, "baz.enc", secretKey1);
        String finalStr = fileEncrypterDecrypter.decrypt("baz.enc", secretKey1);

        System.out.println(finalStr);
    }

}

class FileEncrypterDecrypter {
    Cipher cipher;
//    SecretKey secretKey;


    FileEncrypterDecrypter(String transformation) throws NoSuchPaddingException, NoSuchAlgorithmException {
//        this.secretKey = secretKey;
        this.cipher = Cipher.getInstance(transformation);
    }

    void encrypt(String content, String fileName, SecretKey sKey) throws IOException, InvalidKeyException {
        cipher.init(Cipher.ENCRYPT_MODE, sKey);
        byte[] iv = cipher.getIV();

        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             CipherOutputStream cipherOut = new CipherOutputStream(fileOut, cipher)) {
            fileOut.write(iv);
            cipherOut.write(content.getBytes());
        }
    }

    String decrypt(String fileName, SecretKey sKey) throws IOException, InvalidAlgorithmParameterException, InvalidKeyException {

        String content;

        try (FileInputStream fileIn = new FileInputStream(fileName)) {
            byte[] fileIv = new byte[16];
            fileIn.read(fileIv);
            cipher.init(Cipher.DECRYPT_MODE, sKey, new IvParameterSpec(fileIv));

            try (
                    CipherInputStream cipherIn = new CipherInputStream(fileIn, cipher);
                    InputStreamReader inputReader = new InputStreamReader(cipherIn);
                    BufferedReader reader = new BufferedReader(inputReader)
            ) {

                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }
                content = sb.toString();
            }
        }
        return content;
    }
}