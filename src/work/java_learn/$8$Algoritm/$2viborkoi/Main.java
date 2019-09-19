package work.java_learn.$8$Algoritm.$2viborkoi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 23, 4, 5, 6, 9, 3, 654, 7, 8, 45, 46, 222, 87, 34};


        foo1(arr);
        long t1 = System.nanoTime();
        System.out.println((System.nanoTime() - t1) / 1_000);
        System.out.println("1 : " + Arrays.toString(arr));

//        long t2 = System.nanoTime();
//        foo2(arr);
//        System.out.println((System.nanoTime() - t2) / 1_000);
//        System.out.println("2 : " + Arrays.toString(arr));

//        long t3 = System.nanoTime();
//        foo3(arr);
//        System.out.println((System.nanoTime() - t3) / 1_000);
//        System.out.println("3 : " + Arrays.toString(arr));


    }


    public static void foo1(int[] arr) {
        for (int barrier=0; barrier<arr.length-1; barrier++){
            for (int index=barrier+1; index<arr.length; index++){
                if(arr[barrier]>arr[index]){
                    int tmp = arr[barrier];
                    arr[barrier]=arr[index];
                    arr[index]=tmp;
                }
            }
        }
    }


    public static void foo2(int[] arr) {
        for (int barrier = 0; barrier < arr.length; barrier++) {
            for (int index = barrier; index < arr.length; index++) {
                int minIndex = barrier;
                if (index < arr.length - 1) {
                    if (arr[index] > arr[index + 1]) {
                        minIndex = index + 1;
                    }
                }
                if (arr[barrier] > arr[minIndex]) {
                    int tmp = arr[barrier];
                    arr[barrier] = arr[minIndex];
                    arr[minIndex] = tmp;
                }
            }
        }
    }


    public static void foo3(int[] arr) {
        for (int barrier = 0; barrier < arr.length; barrier++) {
            for (int index = barrier; index < arr.length; index++) {
                int bar = arr[barrier];
                int minIndex = barrier;
                if (index < arr.length - 1) {
                    if (arr[index] > arr[index + 1]) {
                        minIndex = index + 1;
                    }
                }
                if (bar > arr[minIndex]) {
                    arr[barrier] = arr[minIndex];
                    arr[minIndex] = bar;
                }
            }
        }
    }
}

