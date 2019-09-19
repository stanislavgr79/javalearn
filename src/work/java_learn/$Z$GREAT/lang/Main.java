package work.java_learn.$Z$GREAT.lang;

import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {


        ////////////////////////// одно слово
        String str1 = "java";
        // if (Character.isLowerCase( str1.charAt( 0 ) ))
        str1 = Character.toUpperCase( str1.charAt( 0 ) ) + str1.substring( 1 );
        System.out.println( str1 );


        ////////////////////// предложение
        String str2 = "whatever, you want.";
        String out = "";
        StringTokenizer st = new StringTokenizer( str2, " " );
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            out += " " + s.substring( 0, 1 ).toUpperCase() + s.substring( 1 ).toLowerCase();
        }
        out=out.trim();
        System.out.println( out );

        //////////// предложение
        String str3 = "hot, java";
        String[] array = str3.split( " " );
        for (int i = 0; i < array.length; i++) {
            char x = array[i].charAt( 0 );
            x = Character.toUpperCase( x );
            array[i] = array[i].replace( array[i].charAt( 0 ), x );
        }
        String finalstring = String.join( " ", array );
        System.out.println( finalstring );

        int i = 1234;
        String str4 = Integer.toString(i);
        System.out.println(str4);

        //

    }
}

