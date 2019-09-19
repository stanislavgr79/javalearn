package work.java_learn.$5$SearchCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class $08_Compare_Map_Map {

    public static void main(String[] args) {

        Map<String, String> asiaCapital1 = new HashMap<String, String>();
        asiaCapital1.put("Japan", "Tokyo");
        asiaCapital1.put("South Korea", "Seoul");

        Map<String, String> asiaCapital2 = new HashMap<String, String>();
        asiaCapital2.put("South Korea", "Seoul");
        asiaCapital2.put("Japan", "Tokyo");

        Map<String, String> asiaCapital3 = new HashMap<String, String>();
        asiaCapital3.put("Japan", "Tokyo");
        asiaCapital3.put("China", "Beijing");
        asiaCapital3.put("China2", "Beijing2");

//        System.out.println(areEqual(asiaCapital1, asiaCapital2));

//        asiaCapital1.keySet().stream().forEach(o-> System.out.println(o));
//        asiaCapital2.keySet().stream().forEach(o-> System.out.println(o));


        boolean allMatch = asiaCapital3.keySet().stream()
                .allMatch(o-> asiaCapital2.keySet().stream().anyMatch(q->o.equals(q)));

//        System.out.println(allMatch);

        TreeMap<String, String> mmm222 = concat(asiaCapital2, asiaCapital3);
        mmm222.entrySet().stream().forEach(o-> System.out.println(o.getKey() + " " + o.getValue()));
    }

    private static boolean areEqual(Map<String, String> first, Map<String, String> second) {
        if (first.size() != second.size()) {
            return false;
        }

        return first.entrySet().stream()
                .allMatch(e -> e.getValue().equals(second.get(e.getKey())));
    }

    private Map<String, Boolean> areEqualKeyValues(Map<String, String> first, Map<String, String> second) {
        return first.entrySet().stream()
                .collect(Collectors.toMap(e -> e.getKey(),
                        e -> e.getValue().equals(second.get(e.getKey()))));
    }

//    объединение Map
    private static TreeMap<String, String> concat (Map<String, String> first, Map<String, String> second){
        TreeMap<String, String> temp = new TreeMap<>(first);
        second.entrySet().stream().filter(e->!e.getKey()
//                .equals(temp.get(e.getKey())))
                .equals(temp.entrySet().stream().filter(q-> q.getKey().equals(e.getKey()))))
                .forEach(o-> temp.put(o.getKey(), o.getValue()));
        return temp;
    }

}
