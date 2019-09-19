package work.$8$Algoritm.$1puzirec;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[] arr = new int[]{23, 4, 5, 6, 9, 3, 1, 7, 8, 45, 46, 222, 87, 34};

        puzirecNazad(arr);
        System.out.println("!!" + Arrays.toString(arr));


    }

//    static void puzirecVpered(int[] arr) {
//
//        for (int i = arr.length-1; i > 0; i--) {
//            for (int index = 0; index < i; index++) {
//
//                if (arr[index] > arr[index + 1]) {
//                    int a = arr[index];
//                    arr[index] = arr[index + 1];
//                    arr[index + 1] = a;
//                }
//            }
//        }
//    }

    static void puzirecNazad(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int index = arr.length-1; index > i; index--) {
                if (arr[index] < arr[index - 1]) {
                    int a = arr[index];
                    arr[index] = arr[index - 1];
                    arr[index - 1] = a;
                }
            }
        }
    }


}
