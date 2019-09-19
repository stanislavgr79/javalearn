package work.$8$Algoritm;

import java.util.*;
import java.util.stream.IntStream;

public class Main {


    public static void main(String[] args) {

        String str = "java";


//        puzirecVpered2(arr);

        int[] arr = new int[]{23, 4, 5, 6, 9, 3, 1, 7, 8, 45, 46, 222, 87, 34};
        Integer [] a1 =Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(a1, Collections.reverseOrder());
//        Collections.sort();


//        invert(arr);
//        arr = invert2(arr);
        System.out.println("!!" + Arrays.toString(a1));
        int y = Arrays.stream(arr).sum();
        double x = Arrays.stream(arr).average().orElse(Double.NaN);
        double x2 = Arrays.stream(arr).average().getAsDouble();
//        System.out.println(x);
        int min = Arrays.stream(arr).min().getAsInt();

    }
// пузырек вставками выборкой сортировка слиянием

    static void puzirecVpered2(int[] arr) {
        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
              swapP(arr, j, j+1);
            }
        }
    }

    static void swapP(int[] array, int first, int second) {
        if (array[first] > array[second]) {
            int temp = array[first];
            array[first] = array[second];
            array[second] = temp;

        }
    }

    public static int maxValue(final int[] intArray) {
        return IntStream.range(0, intArray.length).map(i -> intArray[i]).max().getAsInt();
    }

    public static double findAverageUsingStream(int[] array) {
        return Arrays.stream(array).average().orElse(Double.NaN);
    }

    public static OptionalDouble findSumUsingStream(Integer[] array) {
        return Arrays.stream(array)
                .mapToInt(Integer::intValue)
                .average();
    }

    public static void invert(int[] data) {
        for (int k = 0; k < data.length / 2; k++) {
            int tmp = data[k];
            data[k] = data[(data.length - 1) - k];
            data[(data.length - 1) - k] = tmp;
        }

    }

    public static int[] invert2(int[] data) {
        int[] temp = new int[data.length];
        for (int i = 0, k = data.length - 1; i < data.length; i++, k--) {
            temp[i] = data[k];
        }
        return temp;
    }


}