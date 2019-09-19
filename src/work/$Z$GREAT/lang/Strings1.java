package work.$Z$GREAT.lang;



import java.util.Arrays;
import java.util.Scanner;

public class Strings1 {

    private static Scanner s;

    public static void main(String[] args) {

        String str1 = "jAva, hot";
        String str2 = "jAva, hOt ";
        String stremp = "";
        String str3 = "";
        String str4 = "";
        String str5 = "";


        //  charAt --- обратиться к первому символу
        char out = str1.charAt( 7 );
        System.out.println( out );

        // codePointAt ----- достает код символа аски
        byte b1 = (byte) str1.codePointAt( 1 );
        int s2 = str1.codePointAt( 1 );
        System.out.println( b1 );
        System.out.println( s2 );

        // compareTo ---- возвращает 0 если лексически верно. 2вар - игнор upper
        int ct1 = str1.compareTo( str2 );
        int ct2 = str1.compareToIgnoreCase( str2 );
        System.out.println( ct1 );
        System.out.println( ct2 );

        // concat ------ сложение строк
        System.out.println( str1.concat( " ! " ).concat( str2 ) );

        // contains ---- поиск в строке возвращает boolean
        String searchString = "Ava";
        if (str1.contains( searchString )) {
            System.out.println( "в стр1 найдено поисковое поле " + searchString + " : " + str1 );
        } else {
            System.out.println( "строка с таким поиском не найдена" );
        }
        // matches ---- проверка как contains
        String[] filenames = {"test.txt", "sample.doc", "config.sys", "site.xml"};
        System.out.println( filenames[1].matches( ".*.doc" ));

        System.out.println(str1.matches( ".*.ho.*." ));
/*
        // contentEquals --- сравнивает StringBuffer возвращает boolean

        String fullName = "Mark Philly";
        StringBuffer sb = new StringBuffer();

        System.out.print("FirstName:");
        // get the String first name from console input
        s = new Scanner(System.in);
        sb.append(s.nextLine()) ;

        System.out.print("LastName:");
        // get the String last name from console input
        s = new Scanner(System.in);
        sb.append(" "+s.nextLine());

        // verify equality of fullName and string inputs
        if(fullName.contentEquals(sb)){
            System.out.println("String content is equal");
        }
        else{
            System.out.println("String content is not equals");
        }

 */
        //equals = equalsIgnoreCase ----- сравнение строк
        boolean bool1, bool2;
        bool1 = str1.equals( str2 ); // object
        bool2 = str1.equalsIgnoreCase( str2 ); //string
        System.out.println( bool1 );
        System.out.println( bool2 );

        // endsWith принимает часть стринга возвращает булеан
        String checkEnd = "ot";
        System.out.println( str1.endsWith( checkEnd ) );

        /// getChars------- string to charArray []
        String source = "This is a demo";
        char[] target = new char[source.length()];
        target[0] = '*';
        target[1] = '/';
        source.getChars( 5, source.length(), target, 2 );
        System.out.println( Arrays.toString( target ) );

        // getBytes  ------- string to byte []
        byte[] byte3 = str1.getBytes();
        System.out.println( Arrays.toString( byte3 ) );

        // String argument which we want to check the position on our String
        System.out.println( str1.indexOf( "ot" ) );

        System.out.println( "aaBBcccaad".lastIndexOf( "aa" ) );
        System.out.println( "aacacaab".lastIndexOf( "a", 4 ) );

        //isEmpty()
        System.out.println( stremp.isEmpty() );
        System.out.println( str1.isEmpty() );

        // replace & all
        String strValue = "Name|age|Country";
        // method chaining, multiple replacement
        strValue = strValue.replace("|", "/").replace('C', 'c');
        System.out.println(strValue);

        String exampleString = "1234123";
        exampleString.replaceAll("1","x");
        System.out.println(exampleString);

        // substring -------new string from old
        System.out.println(str1.substring( 0,5 ));

        // string to charArray
        char [] charArr = str1.toCharArray();
        System.out.println(Arrays.toString( charArr ));

        System.out.println(str1.toUpperCase());

        str3 =str1.toString();
        System.out.println(str3);

        // delete space <>
        str2=str2.trim();
        System.out.println(str2);

        // String.valueOf(boolean) в стринг
        String bool3 = String.valueOf(str1.contains(  "ot"));
        System.out.println(bool3);

        //////////// СОБРАТЬ ИЗ ЧАРАРРЭЙ СТРОКУ
        String strValue1 = "William";
        // convert strValue to character array
        char[] values2 = strValue1.toCharArray();
        // for each element on char array
        for(char c:values2){
            // print the String value of char c
            //System.out.print(String.valueOf(c));
            str5 += c;
        }
        String strValue4 = String.valueOf(values2);
        System.out.printf("%n" +"$1 " + str5);
        System.out.println();
        System.out.println("$2 " + strValue4);

        /////////СОБРАТЬ ИЗ ЧАРАРРЭЙ СТРОКУ 2
        // declare the character array
        char[] data1 = new char[]{'a','b','c','d'};
        // getting the String equivalent of char array data
        String strValue3 = String.valueOf(data1);
        // printing the String equivalent of char array
        System.out.println("!!!!!" + strValue3);

        // change the value of char array
        // convert a string to char array
        data1 = "test".toCharArray();
        // check if the strValue has been changed by
        // reinitializing the data array
        strValue3 = String.valueOf(data1);
        System.out.println("After reinitialization: "+strValue3);


    }
}