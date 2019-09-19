package work.java_learn.$Z$GREAT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class TestQ {
    public static void main(String[] args)
    {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);

//ввод строк с клавиатуры
        ArrayList<String> list = new ArrayList<String>(4);
        for (int i = 0; i < list.size(); i++)
        {
            String str1 = null;
            try {
                str1 = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            list.add(str1);
        }


//вывод содержимого коллекции на экран
        for (int i = 0; i < list.size(); i++)
        {
            int j = list.size() - i - 1;
            System.out.println( list.get(j) );
        }
/*
 ////////////////////////////
        Scanner scanner = new Scanner( System.in );
        String[] list2 = new String[4];

        for (int i=0; i<list2.length; i++){
            list2[i]=scanner.next();
        }
        scanner.close();

//вывод содержимого
        String j = "";
        for (int i = 0; i < list2.length; i++) {

            j += (list2[i]) + " ";
        }
        System.out.println( j);
        */
    }
}
