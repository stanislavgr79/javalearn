package work.$5$SearchCollections;

import java.util.*;

public class $06_Immutable_Sets {

    public static void main(String[] args) {

        MMMM mmmm = new MMMM();
        mmmm.setMMMunmodifiable.stream().forEach(System.out::println);

        String str = "1,один\n2,два\n3,три";
        Set<String> immutable = Set.of("Canada", "USA");

        Set<String> immutable2 = Set.of(str);

//        immutable2.add("DDD"); // так нельзя
        immutable2.stream().forEach(o-> System.out.println(o));

    }
}

class MMMM{
    Set<String> setMMMunmodifiable = Collections.unmodifiableSet(new MMMM_Set().getSet());


    static class MMMM_Set{
        private Set<String> set = new HashSet<>();

        public Set<String> getSet() {
            return set;
        }

        private void setSet() {
            set.add("Canada");
            set.add("USA");
        }

        private MMMM_Set(){
            setSet();
        }
    }
}