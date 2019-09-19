package work.$5$SearchCollections;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class $07_FindEqualsEl_InTwoList {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("red", "blue", "blue", "green", "red");
        List<String> otherList = Arrays.asList("red", "green", "green", "yellow");

        Set<String> set = list.stream()
                .distinct()
                .filter(o-> otherList.contains(o))
//                .filter(o-> otherList.stream().distinct().anyMatch(q->o.equals(q)))
                .collect(Collectors.toSet());

        set.forEach(o-> System.out.println(o));
        System.out.println(set.size());

    }
}

