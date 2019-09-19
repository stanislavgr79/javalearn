package work.$8$Algoritm.$4sliianiem;

import java.util.Arrays;

public class Main2 {


    public static void main(String[] args) {

        int[] a = {1, 4, 7, 7, 9, 14, 16};
        int[] b = {2, 5, 8, 13, 18, 19, 21, 22, 47, 99};

        int[] rezult = sortedArrayMerge(a, b);
        System.out.println(Arrays.toString(rezult));
//        perevorot(a);
//        System.out.println(Arrays.toString(a));
//        puz(a);
//        vib(a);
//        vst(a);
//        System.out.println(Arrays.toString(a));

    }

    public static void perevorot(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void puz(int [] arr){
        for(int barrier=arr.length-1; barrier>0; barrier--){
            for (int index=0; index<barrier; index++){
                if(arr[index]>arr[index+1]){
                    int tmp=arr[index];
                    arr[index]=arr[index+1];
                    arr[index+1]=tmp;
                }
            }
        }

    }

    public static void vib(int[]arr){
        for(int barrier=0; barrier<arr.length; barrier++){
            for (int index=barrier+1; index<arr.length; index++){
                if (arr[barrier]>arr[index]){
                    int tmp = arr[barrier];
                    arr[barrier]=arr[index];
                    arr[index]=tmp;
                }
            }
        }
    }

    public static void vst(int [] arr){
        for (int barrier=1; barrier<arr.length; barrier++){
            int nextEl=arr[barrier];
            int previosIndex=barrier-1;
            while (previosIndex>=0 && nextEl<arr[previosIndex]){
                arr[previosIndex+1]=arr[previosIndex];
                previosIndex--;
            }
            arr[previosIndex+1]=nextEl;
        }
    }

    public static int[] merge(int[] arrA, int[] arrB) {
        int[] result = new int[arrA.length + arrB.length];
        int aIndex = 0;
        int bIndex = 0;
        int resIndex = 0;

        while (aIndex < arrA.length && bIndex < arrB.length) {
            result[resIndex] = arrA[aIndex] < arrB[bIndex] ? arrA[aIndex++] : arrB[bIndex++];
            if (aIndex == arrA.length) {
                System.arraycopy(arrB, bIndex, result, ++resIndex, arrB.length - bIndex);
                break;
            }
            if (bIndex == arrB.length) {
                System.arraycopy(arrA, aIndex, result, ++resIndex, arrA.length - aIndex);
                break;
            }
            resIndex++;
        }


        return result;
    }

    //  ИДЕАЛ !!!!!!!!!!!!!!
    private static int[] sortedArrayMerge(int arrA[], int arrB[]) {
        int arrResult[] = new int[arrA.length + arrB.length];
        int aIndex = 0;
        int bIndex = 0;
        int rIndex = 0;
        while (aIndex < arrA.length && bIndex < arrB.length) {
//            if(arrA[aIndex]<arrB[bIndex]) {
//                arrResult[rIndex++] = arrA[aIndex++];
//            } else {
//                arrResult[rIndex++] = arrB[bIndex++];
//            }
//        }
            arrResult[rIndex++] = arrA[aIndex] < arrB[bIndex] ? arrA[aIndex++] : arrB[bIndex++];
//            rIndex++;
        }
        if (aIndex < arrA.length) {
            System.arraycopy(arrA, aIndex, arrResult, rIndex, (arrA.length - aIndex));
        }
        if (bIndex < arrB.length) {
            System.arraycopy(arrB, bIndex, arrResult, rIndex, (arrB.length - bIndex));
        }

        return arrResult;
    }
}