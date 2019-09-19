package work.java_learn.$Z$GREAT;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class Candy {
}

public class Arrays1 {

    public String text = ""; // temp string


    String[] strArray1 = {"abc", "cde", "edf", "dfg", "fgk"};
    String[] strArray2 = new String[]{"abc", "cde", "edf", "dfg", "fgk"};
    char chArray[] = {'a', 'b', 'c', 'd', 'e'};
    boolean[] booleanArray = {true, false};

    int[] intArray1 = {1, 2, 3, 4, 5};

    int[] intArrayUnknown = new int[5];
    char[] charArrUnknown = new char[5];
    String[] strArray3Unknown = new String[5];
    boolean[] booleanArrayUnknown = new boolean[2];

    Candy[] box = new Candy[3];   //объявление массива
    Candy candyFirst = new Candy();  // инициализация трех конфет
    Candy candySecond = new Candy();
    Candy candyThird = new Candy();

    Candy[] box2 = {candyFirst, candySecond, candyThird}; //массив ирех конфет

    int[][] intArrayUnknMass2 = new int[3][3];

    /////////////////////////////////////////////
    // ввод массива с консоли
    final public void textConsole() {
        Scanner scanner = new Scanner( System.in );
        for (int i = 0; i < intArrayUnknown.length; i++) {
            intArrayUnknown[i] = scanner.nextInt();
        }
        scanner.close();
    }

    // char array в одну строку с text for-eche
    public void charArrToOneStr() {
        for (char element : chArray) {
            text += " " + element;
        }
        System.out.println( text );
    }

    // char array в одно строку с text for
    public void charArrToOneStrText() {
        for (int i = 0; i < chArray.length; i++) {
            text += " " + Character.toString( chArray[i] );
        }
        System.out.println( text );
    }

    //вывод содержимого массива на экран в обратном порядке
    public void strToNextLineStrReverse() {
        for (int i = 0; i < strArray1.length; i++) {
            int j = strArray1.length - i - 1;
            System.out.println( strArray1[j] );
        }
    }
/* //вывод содержимого массива на экран в обратном порядке/ любом порядке и str
        for (int i = 0; i < list2.length; i++)
        {
            String j =  (list2[list2.length - i-1]) +" ";
            System.out.println( j);
        }
*/

    // string array в одну строку
    public void strArrToOneStr() {
        for (String element : strArray1) {
            text += " " + element;
        }
        System.out.println( text );
    }

    // string array в одну строку c text
    public void strArrToSrtOneStrText() {
        //  String str1 = "hot, java";
        // String[] array = str1.split( " " );
        text = String.join( " ", strArray1 );
        System.out.println( text );
    }

    // int array в одну строку
    public void intArrToOneStr() {
        for (int element : intArray1) {
            text += " " + element;
        }
        System.out.println( text );
    }

    // вывод построчно элементов стринг массива без text
    public void strArrToStrNextLine() {
        for (String element : strArray1) {
            System.out.println( element );
        }
    }

    // вывод построчно элементов char массива без text
    public void charArrToStrNextLine() {
        for (char element : chArray) {
            System.out.println( element );
        }
    }

    // вывод построчно элементов int массива без text
    public void intArrToStrNextLine() {
        for (int element : intArray1) {
            System.out.println( element );
        }
    }


    // вывод построчно элементов int массива c text
    public void intArrToStrNextLineText() {
        for (int i = 0; i < intArray1.length; i++) {
            text += " " + intArray1[i];
        }
        System.out.println( text );
    }

    // вывод построчно элементов int массива c text = обратный порядок
    public void intArrToStrNextLineTextReverse() {
        for (int i = intArray1.length - 1; i >= 0; i--) {
            text += " " + intArray1[i];
        }
        System.out.println( text );
    }

    // string array to string
    public void foo(String[] arr) {
        ArrayList<String> arrayList = new ArrayList<String>( Arrays.asList( arr ) );
        System.out.println( arrayList );
    }

    //Проверка массива на наличие конкретного значения
    public void checkStrArray(String[] arr) {
        boolean b = Arrays.asList( arr ).contains( "abc" );
        System.out.println( b );
    }
/*
    // Объединение двух массивов
    int[] intArray = { 1, 2, 3, 4, 5 };
    int[] intArray2 = { 6, 7, 8, 9, 10 };
    // Apache Commons Lang library
    int[] combinedIntArray = ArrayUtils.addAll(intArray, intArray2);

Объединение элементов массива в строку
    // containing the provided list of elements
    // Apache common lang
    String j = StringUtils.join(new String[] { "a", "b", "c" }, ", ");
    System.out.println(j);
    // a, b, c

  //Возврат массива с элементами в обратном порядке
int[] intArray = { 1, 2, 3, 4, 5 };
        ArrayUtils.reverse(intArray);
        System.out.println(Arrays.toString(intArray))

Удаление элемента из массива
int[] intArray = { 1, 2, 3, 4, 5 };
int[] removed = ArrayUtils.removeElement(intArray, 3);//create a new array
System.out.println(Arrays.toString(removed));
 */

    public static void main(String[] args) {

        // Преобразование ArrayList в массив
        String[] strArr1 = {"a", "b", "c", "d", "e"};
        ArrayList<String> newList1 = new ArrayList<String>( Arrays.asList( strArr1 ) );
        String[] strArr2 = new String[newList1.size()];
        newList1.toArray( strArr2 );
        for (String element : strArr2)
            System.out.println( element );

        // объединение массивов
        String[] arr1 = {"a", "b", "c"}; //объявляем 1 массив
        String[] arr2 = {"d", "e", "f"}; //объявляем 2 массив
        String[] arr3 = new String[arr1.length + arr2.length]; //обьявляем 3 массив с длиной равной сумме двух предыдущих
        System.arraycopy( arr1, 0, arr3, 0, arr1.length ); //копируем 1 массив в третий
        System.arraycopy( arr2, 0, arr3, arr1.length, arr2.length ); //копируем 1 массив в третий
        //выводим результат в консоль
        for (String a : arr3) {
            System.out.print( a + " " );
        }

        // большой массив на 2 маленьких
        int[] big = new int[20];
        int[] small1 = new int[10];
        int[] small2 = new int[10];
        System.arraycopy( big, 0, small1, 0, 10 );
        System.arraycopy( big, 10, small2, 0, 10 );

        int[] arr = {1, 2, 3, 4};
        ByteBuffer byteBuffer = ByteBuffer.allocate( arr.length * 4 );
        for (int value : arr) {
            byteBuffer.putInt( value );
        }
        final byte[] bytes = byteBuffer.array();
        for (byte t : bytes) {
            System.out.println( "" );
            System.out.format( "0x%x ", t );
        }

        // Arrays1 arrays = new Arrays1();
        //String[] stringArray = { "a", "b", "c", "d", "e" };
        //   arrays.checkIntArray( arrays.intArray1 );
    }
}
