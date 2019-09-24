package work.Solo.Files;

import java.io.*;

public class Files2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File dir = new File(".");
        String[] names = dir.list();

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        File file = new File("README2");
        System.out.println(file.length());

        String separator  = File.separator;
        String path = separator + "d" + separator + "1.txt";


//        Scanner scanner = new Scanner(file );
//        List <String> list = new ArrayList<>(  );
//        while(scanner.hasNextLine()) {
//           // System.out.println(scanner.nextLine());
//            list.add( scanner.nextLine() );;
//        }
//            scanner.close();
//     //   for(int i=0; i<list.size(); i++){
//     //       System.out.println( list.get( i) );
//      //  }
//        for (String i: list){
//            System.out.println(i);;
//        }
/*
        FileInputStream input = new FileInputStream("1.txt");
        int length = input.available();
        System.out.println(length);

        byte[] data = new byte[length];
        input.read(data);

        String text = new String(data);
        System.out.println(text);

    */
        String newText = "<!-- Hello Worlds -->";
        FileOutputStream output = new FileOutputStream(file, true);
        BufferedOutputStream bos = new BufferedOutputStream(output, 8*1024);
        byte[] newTextBytes = newText.getBytes();
        bos.write(newTextBytes);
        bos.close();


    }
}

