package work.$5$SearchCollections;

import java.util.*;
import java.util.stream.Collectors;

public class $03_Map_Stream {

   public static Map<String, String> books = new HashMap<>();

    public static void main(String[] args) {


        books.put("978-0201633610", "Design patterns : elements of reusable object-oriented software");
        books.put("978-1617291999", "Java 8 in Action Second: Lambdas, Streams, and functional-style programming");
        books.put("978-0134685991", "Effective Java");
        books.put("978-0321356680", "Java: Second Edition");

        Set<Map.Entry<String, String>> entries = books.entrySet();
        Set<String> strings = books.keySet();
        Collection<String> values = books.values();

        Optional<String> optionalIsbn = books.entrySet().stream()
                .filter(e -> "Effective Java".equals(e.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();

        Optional<String> optionalValue = findBook("978-1617291999");
//        System.out.println(optionalValue.get());

        List<String> listKey = books.entrySet().stream()
                .filter(o-> o.getValue().startsWith("Java"))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
//        listKey.iterator().forEachRemaining(System.out::println);

        Set<Map.Entry<String, String>> mySet = books.entrySet().stream()
                .filter(o-> o.getValue().contains("Second"))
                .collect(Collectors.toSet());
        mySet.stream().forEach(o-> System.out.println(o.getKey() + " " + o.getValue()));
    }


    public static Optional<String>  findBook(String key){
        return books.entrySet().stream()
                .filter(k-> key.equals(k.getKey()))
                .map(Map.Entry::getValue)
                .findFirst();
    }


}
