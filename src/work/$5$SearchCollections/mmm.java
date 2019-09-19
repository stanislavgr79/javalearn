package work.$5$SearchCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Stream.*;

public class mmm {

    public static void main(String[] args) {

        int[] array = {5, 3, 4, 1, 4, 6};
        int[] array2 = {5, 3, 6, 1, 6, 4};
        int[] array3 = {55, 33, 66, 11, 66, 44, 44};

        int sum1 = IntStream.of(array).boxed().collect(Collectors.toList()).stream()
                .mapToInt(i->i).sum();

        double sum2 = IntStream.of(array).sum();

        ;

        System.out.println(sum1);

        int a = 5;
        Integer z = Integer.valueOf(a);
//        System.out.println(z);

        List<Integer> list1 = IntStream.of(array).boxed().collect(Collectors.toList());
        List<Integer> list2 = IntStream.of(array2).boxed().collect(Collectors.toList());
        List<Integer> list3 = IntStream.of(array3).boxed().collect(Collectors.toList());
list1.stream().forEach(o-> System.out.print(o));
        System.out.println("");
list2.stream().forEach(o-> System.out.print(o));
        System.out.println("");


//        run(list1);
//        run(list2);
//        System.out.println(list1.equals(list2));
        System.out.println(checkIfGood(list1, list2));
        //
//        Integer[] combined = (Integer[]) Stream.concat(of(array), of(array2)).toArray();
//        List<Integer> combined2 = concatTwo(list1, list2);
//        combined2.forEach(o-> System.out.print("["+o+"]"+" "));

//        run(combined2);
//        combined2.forEach(o-> System.out.print("["+o+"]"+" "));
    }

    public static int checkIfGood(List list1, List list2) {
//        if(list1.size()!=list2.size()) return false;
        List temp = new ArrayList(list2);
        int initial = temp.size();
        temp.removeIf(list1::contains);
        return initial - temp.size();
//        return temp.size()==0 && list1.size()==list2.size() ? true : false;
    }

    public static List<Integer> concatTwo(List<Integer> first, List<Integer> second) {
        return of(first, second).flatMap(Collection::stream).distinct().collect(Collectors.toList());
    }

    public static void run(List list) {
        sortedList(list, 0, list.size() - 1);
    }

    public static void sortedList(List list, int firstIndex, int lastIndex) {

        if (list.size() == 0) return;
        if (firstIndex >= lastIndex) return;

        int middle = firstIndex + (lastIndex - firstIndex) / 2;
        int opora = (int) list.get(middle);
        int f = firstIndex, l = lastIndex;
        while (f <= l) {
            while ((int) list.get(f) < opora) f++;
            while ((int) list.get(l) > opora) l--;

            if (f <= l) {
                int temp = (int) list.get(f);
                list.set(f, list.get(l));
                list.set(l, temp);
                f++;
                l--;
            }
        }
        if (firstIndex < l) sortedList(list, firstIndex, l);
        if (lastIndex > f) sortedList(list, f, lastIndex);

    }
}


