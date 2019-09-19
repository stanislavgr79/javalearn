package work.java_learn.$5$SearchCollections;

import java.util.*;
import java.util.stream.Collectors;

public class $01_ListSetMap {

    public static void main(String[] args) {
        int [] array = {1, 2, 3};
        Iterator<Integer> iterator = Arrays.asList(1, 2, 3).iterator();


//        List list = new ArrayList();
//        while (iterator.hasNext()){
//            list.add(iterator.next());
//        }
//        list.forEach(o-> System.out.println(o));

        List list1 = new ArrayList();
        iterator.forEachRemaining(list1::add);
//        list1.forEach(o-> System.out.println(o));

//        List list2 = new ArrayList();
//        list2 = Arrays.stream(array).boxed().collect(Collectors.toList());
//        list2.forEach(o-> System.out.println(o));

//            List list3 = new ArrayList();
//            list3 = IteratorUtils.toList(iterator);
//            list3.forEach(o-> System.out.println(o));

            Set set = new HashSet(list1);
//            set = Arrays.stream(array).boxed().collect(Collectors.toSet());

            Set set1 = new HashSet();
            set1.addAll(set);
//            set1.iterator().forEachRemaining(System.out::println);

        HashMap<String, Employee2> map = new HashMap<>();
        Employee2 emp11 = new Employee2("John");
        Employee2 emp21 = new Employee2("Norman");
        map.put("emp1", emp11);
        map.put("emp2", emp21);

        HashMap<String, Employee2> shallowCopy = (HashMap<String, Employee2>) map.clone();
//        shallowCopy.entrySet().forEach(o-> System.out.println(o));

        HashMap<String, Employee2> map2 = new HashMap<>();

        Set<Map.Entry<String, Employee2>> entries = map.entrySet();
//        for (Map.Entry e: entries){
//            map2.put((String) e.getKey(),(Employee) e.getValue());
//        }
        map2 = (HashMap<String, Employee2>) entries.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//        map2.entrySet().forEach(o-> System.out.println(o));


    }

}

class Employee2{
    private String name;

    public Employee2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}