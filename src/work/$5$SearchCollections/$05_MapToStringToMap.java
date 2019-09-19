package work.$5$SearchCollections;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class $05_MapToStringToMap {

    public static void main(String[] args) {

        // string to Map
        String str = "1,один\n2,два\n3,три";
        Map<String, String> map1 = Arrays.asList(str.split(System.lineSeparator())).stream()
                .map(entry-> entry.split(","))
                .collect(Collectors.toMap(entry -> entry[0], entry -> entry[1]));

        // Map to String $1
        StringBuilder stringBuilder = new StringBuilder();
//        map1.entrySet().stream().forEach(o-> System.out.println(o.getKey() +  " " + o.getValue()));
        map1.entrySet().stream().forEach(o-> stringBuilder.append(o.getKey() +  "," + o.getValue()+"\n"));
//        System.out.println(stringBuilder.toString());

        // Map to String $2
        String strGG = map1.entrySet().stream().map(o-> o.getKey().concat(",").concat(o.getValue()))
                .collect(Collectors.joining(System.lineSeparator()));
        System.out.println(strGG);
    }
}
