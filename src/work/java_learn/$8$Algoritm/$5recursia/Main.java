package work.java_learn.$8$Algoritm.$5recursia;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        foo(1);
        int[] arr = new int[]{1, 2, 3};
//        per(arr, 0);
//        System.out.println(Arrays.toString(arr));
//
//        System.out.println(fib(6));
//        fib2(5);
        permute(arr, arr.length);
//        System.out.println(Arrays.toString(arr));
    }

    private static void permute(int[] arr, int size) {
        if (size==1){
            System.out.println(Arrays.toString(arr));
        }else{
            for (int k = 0; k <size ; k++) {
                swap(arr,k,size - 1);
                permute(arr,size - 1);
                swap(arr,size - 1,k);
            }
        }
    }

    private static void swap(int[] arr, int k, int i) {
        int tmp = arr[k];
        arr[k] = arr[i];
        arr[i] = tmp;
    }

    public static void foo(int i) {
//        System.out.print(i);
        if (i < 7) {
            foo(2 * i);
        }
        System.out.print(i);
    }

    public static void per(int[] arr, int k) {
        if (k < arr.length / 2) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - 1 - k];
            arr[arr.length - 1 - k] = tmp;
            per(arr, k + 1);
        }
    }

    public static int fib(int arg) {
        if (arg == 0) return 1;
        if (arg == 1) return 1;
        int[] arr = new int[arg + 1];
        arr[0] = 1;
        arr[1] = 1;
        for (int index = 2; index < arr.length; index++) {
            arr[index] = arr[index - 2] + arr[index - 1];
        }
        return arr[arr.length - 1];
    }

    public static int fib2(int k) {
        System.out.print(" " + k);
        return k < 2 ? 1 : fib2(k - 2) + fib2(k - 1);
    }
}


