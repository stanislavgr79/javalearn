package work.$5$SearchCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class $04_CheckElementInList {

    public static void main(String[] args) {

        List<String> verifyListTrue = Arrays.asList("Jack", "Jack", "Jack", "Jack");
        List<String> verifyListFalse = Arrays.asList("Jack", "Jack", "Jack", "Jac");

        boolean rez = checkAllEquals4(verifyListTrue);
        System.out.println(rez);

    }

    public static boolean checkAllEquals(List list){
        return list.stream().allMatch(list.get(0)::equals);
    }

    public static boolean checkAllEquals2 (List list){
        return list.stream().distinct().count()<=1;
    }

    public static boolean checkAllEquals3(List list){
        return new HashSet<Object>(list).size()<=1;
    }

    public static boolean checkAllEquals4(List list){
        return Collections.frequency(list, list.get(0))==list.size();
    }
}
