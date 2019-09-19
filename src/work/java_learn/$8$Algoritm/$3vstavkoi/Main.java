package work.java_learn.$8$Algoritm.$3vstavkoi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 4, 5, 6, 9, 3, 1, 7, 8, 45, 46, 0, 222, 87, 34};

//        sort(arr);
        System.out.println(" первый массив  " + Arrays.toString(arr));

        int[] insert = {2, 4, 5, 23 , 43,  7, 55};

        int[] arrFinal = copy(arr, insert);

        System.out.println(Arrays.toString(arrFinal));

    }

    public static int[] copy(int [] arr, int[] insert){
        int [] arrFinal = new int[arr.length+insert.length];
        System.arraycopy(arr,0,arrFinal,0,arr.length);
        System.out.println(Arrays.toString(arrFinal));
        for (int el : insert) {
            int newPosition = Arrays.binarySearch(arrFinal, 0, arrFinal.length, el);
            if (newPosition < 0) {
                newPosition = -newPosition - 1;
            }
            System.arraycopy(arrFinal, newPosition, arrFinal, newPosition + 1, arrFinal.length-newPosition-1);
            arrFinal[newPosition] = el;
        }
        return arrFinal;
    }
//  2  5 | 3  1 =
//    public static void sort(int [] arr){
//        for (int i=1; i<arr.length; i++){
//            int currentElement = arr[i];
//            int previosIndex = i-1;
//            while (previosIndex>=0 && currentElement<arr[previosIndex]){
//                arr[previosIndex+1]=arr[previosIndex];
//                previosIndex--;
//            }
//            arr[previosIndex+1]=currentElement;
//        }
//    }

}
