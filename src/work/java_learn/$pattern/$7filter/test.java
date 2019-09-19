package work.java_learn.$pattern.$7filter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class test {

    public static void main(String[] args) {

        List<Box> list1 = new ArrayList<>();
        list1.add(new Box("green", 1, 22));
        list1.add(new Box("black", 1, 22));
        list1.add(new Box("ared", 4, 23));
        list1.add(new Box("ared", 1, 13));
        list1.add(new Box("ared", 3, 13));
        list1.add(new Box("ared", 4, 13));
        list1.add(new Box("black", 3, 34));
        list1.add(new Box("black", 4, 17));
        System.out.println(" orig");
        list1.forEach(System.out::println);
        System.out.println("collections.sort");
        Comparator<Box> comparator = (o1,o2) -> o1.getColor().compareTo(o2.getColor());
        Comparator<Box> comparator2 = (o1,o2) -> o1.getId()-(o2.getId());
        Collections.sort(list1, comparator);
        list1.forEach(System.out::println);
        System.out.println();
//        List<Box> afterSort = new ArrayList<>();
//        list1.stream().sorted(comparator.thenComparing(comparator2)).forEach(o-> afterSort.add(o));
        list1 = list1.stream().sorted(comparator.thenComparing(comparator2)).collect(Collectors.toList());
        list1.forEach(System.out::println);

        System.out.println();

        MultiFilter1 multiFilter = new MultiFilter1(new ColorFilter(), new NameFilter());
        List<Box> newList = multiFilter.filterList(list1);
        newList.stream().forEach(System.out::println);

    }

}

interface Ifilter{
    List<Box> filterList (List<Box> list);
}

class ColorFilter implements Ifilter{

    @Override
    public List<Box> filterList(List<Box> list) {
        List<Box> tempList = list.stream().filter(o1-> o1.getColor().equals("black")).collect(Collectors.toList());
        return tempList;
    }
}

class NameFilter implements Ifilter{

    @Override
    public List<Box> filterList(List<Box> list) {
        List<Box> tempList = list.stream().filter(o-> o.getName()>18).collect(Collectors.toList());
        return tempList;
    }
}

class MultiFilter1 implements Ifilter{
Ifilter ifilter1;
Ifilter ifilter2;

    public MultiFilter1(Ifilter ifilter1, Ifilter ifilter2) {
        this.ifilter1 = ifilter1;
        this.ifilter2 = ifilter2;
    }

    @Override
    public List<Box> filterList(List<Box> list) {
        List<Box> tempList = ifilter1.filterList(list);
        List<Box> tempList2 = ifilter2.filterList(tempList);
        return tempList2;
    }
}

class Box{
    private String color;
    private int id;
    private int name;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public Box(String color, int id, int name) {
        this.color = color;
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Box{" +
                "color='" + color + '\'' +
                ", id=" + id +
                ", name=" + name +
                '}';
    }
}