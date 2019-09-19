package work.java_learn.$SE_Rabbit.lesson5;

import java.io.*;

public class MineLesson31 {

    public static void main(String[] args) throws IOException {



        FileInputStream  fis=null;
        InputStreamReader isr= null;
        int b=0;
        try {
            fis = new FileInputStream( "4.txt" );
            isr = new InputStreamReader( fis );
            while ((b=fis.read()) != -1){
                System.out.println((char)b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("+++++++++++++");
        String str = " Hot+++++";
        // FileOutputStream fileOutputStream = null;
        FileWriter fr = null;
        try {
            fr = new FileWriter( "4.txt",true );
            fr.write( str );
            fr.close();
             FileOutputStream fileOutputStream = new FileOutputStream( "4.txt" ,true);
           String newText = "<!-- Hello Мир -->";
           byte[] newTextBytes = newText.getBytes();
           fileOutputStream.write(newTextBytes);
           fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        FileInputStream input = new FileInputStream("4.txt");
        int length = input.available();
        System.out.println(length);

        byte[] data = new byte[length];
        input.read(data);
        String text = new String(data);
        System.out.println(text);

    }

}