package work.java_learn.$8$Algoritm.$5recursia;

import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {

        String s = "abcdf";
//        System.out.println(s.substring(1));
//        System.out.println(foo(s));
//       String rez= reverseStringWithRecursion(s);
//        System.out.println(rez);

        int[] array = new int[]{1, 2, 3, 4, 5, 6};


        System.out.println(Arrays.toString(array));
//        System.out.println(sum2(array));
//
//        System.out.println(n2(125));
    }
    // переворот строки
    public static String foo(String s) {
        return s.length() == 1 ? s : foo(s.substring(1))+s.charAt(0);
    }


    private static int[] swap(int[] arr) {
        int tmp = arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1] = tmp;
        return arr;
    }

    public static void n1(int i){
        if(i==0) return;
        else n1(i-1);
        System.out.println(i);
    }

    public static String n2(int i){

        return i<=9 ? Integer.toString(i) : n2(i / 10) + " " + i % 10;
    }


    public static int sum(int[] arr) {
        int rez = 0;
        for (int i = 0; i < arr.length; i++) {
            rez += arr[i];
        }
        return rez;
    }

    public static int sum2(int[] array) {
        if (array.length==0)
            return 0;
        else return array[0]+sum2(Arrays.copyOfRange(array, 1, array.length));

    }

    public static String reverseStringWithCharAt(String inputString) {
        int stringLength = inputString.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = inputString.charAt(i) + result;
        }
        return result;
    }

    public static String reverseStringWithRecursion(String inputString) {
        String leftPart;
        String rightPart;

        int length = inputString.length();

        // заканчиваем рекурсивный обход
        if (length <= 1) {
            return inputString;
        }

        leftPart = inputString.substring(0, length / 2);
        rightPart = inputString.substring(length / 2, length);

        // рекурсивно переворачиваем левую и правую часть входной строки
        return reverseStringWithRecursion(rightPart) + reverseStringWithRecursion(leftPart);
    }



}
