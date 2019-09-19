package work.$8$Algoritm.$6dynamic;

import java.util.*;

import static java.util.stream.IntStream.iterate;
import static java.util.stream.IntStream.of;

public class Main {

    public static void main(String[] args) {

        int[] arr1 = {9, 5, 2, 7, 4, 6, 3, 8, 1};
        int[] arr2 = {5, 2, 1, 4, 3, 7, 4, 6};

        List list1 = new ArrayList();
//        List list2 = new ArrayList();
//        List list3 = new ArrayList();


//        List<Integer> list5 = Arrays.asList(arr1);
//        List<Integer> list6 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
//        List<Integer> list7 = Stream.of(arr1).collect(Collectors.toList());
//        List<Integer> list8 = new ArrayList(Arrays.asList(arr1));
//        System.out.println(list8.size());

//        List<Integer> list11, list22, list33;
//        list11 = Stream.of(1, 2, 3).collect(Collectors.toList());
//        list22 = Stream.of(1, 2, 3).collect(Collectors.toCollection(ArrayList::new));
//        list33 = Stream.of(1, 2, 3).collect(Collectors.toCollection(LinkedList::new));

        Arrays.stream(arr1).boxed().forEach(o -> list1.add(o));
//        for (int i = 0; i < arr2.length; i++) list2.add(arr2[i]);
//        list3 = Arrays.stream(arr).boxed().collect(Collectors.toList());

//        list1.addAll(list2);
//        Collections.sort(list1);
//

//        quickSortArray(arr1, 0, arr1.length - 1);
//        System.out.println(Arrays.toString(arr1));

        quickSortArray(arr1, 0 , list1.size()-1);
        System.out.println(Arrays.toString(arr1));

    }

    public static void quickSortArray(int [] array, int firstIndex, int lastIndex) {
        if (array.length == 0)  return;//завершить выполнение если длина массива равна 0
        if (firstIndex >= lastIndex)  return;//завершить выполнение если уже нечего делить

        int middleIndex = firstIndex + (lastIndex - firstIndex) / 2;
        int oporaEl = array[middleIndex];

        int f = firstIndex, l = lastIndex;
        while (f <= l) {
            while (array[f] < oporaEl) f++;
            while (array[l] > oporaEl) l--;

            if (f <= l) {//меняем местами
                int temp = array[f];
                array[f] = array[l];
                array[l] = temp;
                f++;
                l--;
            }
        }
        if (firstIndex < l) quickSortArray(array, firstIndex, l);
        if (lastIndex > f)  quickSortArray(array, f, lastIndex);
    }


//    public static void quickSortList(List list, int firstIndex, int lastIndex) {
//        if (list.size() == 0)  return;//завершить выполнение если длина массива равна 0
//        if (firstIndex >= lastIndex)  return;//завершить выполнение если уже нечего делить
//
//        // выбрать опорный элемент
//        int middleIndex = firstIndex + (lastIndex - firstIndex) / 2;
//        int oporaEl = (Integer) list.get(middleIndex);
//
//        // разделить на подмассивы, который больше и меньше опорного элемента
//        int f = firstIndex, l = lastIndex;
//        while (f <= l) {
//            while ((Integer)list.get(f) < oporaEl) f++;
//            while ((Integer)list.get(l) > oporaEl) l--;
//
//            if (f <= l) {//меняем местами
//                Integer temp = (Integer) list.get(f);
//                list.set(f,list.get(l)) ;
//                list.set(l,temp);
//                f++;
//                l--;
//            }
//        }
//
//        if (firstIndex < l) quickSortList(list, firstIndex, l);
//        if (lastIndex > f)  quickSortList(list, f, lastIndex);
//    }



}


