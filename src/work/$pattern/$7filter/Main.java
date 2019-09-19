package work.$pattern.$7filter;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        CarF carF = new CarF( 200, "red", 3 );
        CarF carF2 = new CarF( 50, "ared", 4 );
        CarF carF3 = new CarF( 100, "zgreen", 3 );
        CarF carF4 = new CarF( 180, "dgreen", 6 );

        List<CarF> list = new ArrayList<>();
        list.add( carF );
        list.add( carF2 );
        list.add( carF3 );
        list.add( carF4 );

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Comparator<CarF> comparatorSpeedAndColor = (car1, car2) ->
                (car1.maxSpeed - car2.maxSpeed) & (car1.color.compareTo(car2.color)) ;

        List<CarF> alone;
        alone = (List<CarF>) list.stream().sorted(comparatorSpeedAndColor).collect(Collectors.toList());
        System.out.println("TTTTTTTTTTT");
        alone.forEach( System.out::println );

        list.sort( comparatorSpeedAndColor );
        List<CarF> newList = new ArrayList<>();
        list.stream().filter( carF1 -> carF1.maxSpeed > 75 ).forEach( o -> {
            newList.add( o );
        } );
        System.out.println( newList.size() );
        newList.forEach( o -> System.out.println( o ) );

        System.out.println( "!!!!!!!!!!!" );
        List<CarF> newList2 = carF.filter( list );
        newList2.forEach( o -> System.out.println( o ) );

        System.out.println( "!!!!!!!!" );
        list = new SpeedFilter().filter( list );
//        list.forEach( System.out::println );
//        System.out.println( list.size() );

        MultiFilter multiFilter = new MultiFilter( new SpeedFilter(),new DoorFilter() );
        list = multiFilter.filter( list );
        list.forEach( System.out::println );
        System.out.println( list.size() );
    }


}

interface IcarFilter {
    List<CarF> filter(List<CarF> cars);
}

class SpeedFilter implements IcarFilter {

    @Override
    public List<CarF> filter(List<CarF> cars) {
        List<CarF> tempList = new ArrayList<>();
        cars.stream().filter( carF1 -> carF1.maxSpeed > 101 ).forEach( o -> {
                    tempList.add( o );
                }
        );
        return tempList;
    }
}

class DoorFilter implements IcarFilter {

    @Override
    public List<CarF> filter(List<CarF> cars) {
        List<CarF> tempList = new ArrayList<>();
        cars.stream().filter( carF1 -> carF1.doors > 2 ).forEach( o -> {
                    tempList.add( o );
                }
        );
        return tempList;
    }
}

class MultiFilter implements IcarFilter {
    IcarFilter icarFilter1;
    IcarFilter icarFilter2;

    public MultiFilter(IcarFilter icarFilter1, IcarFilter icarFilter2) {
        this.icarFilter1 = icarFilter1;
        this.icarFilter2 = icarFilter2;
    }

    @Override
    public List<CarF> filter(List<CarF> cars) {
        List<CarF> tempList = icarFilter1.filter( cars );
        return icarFilter2.filter( tempList );
    }
}


class CarF implements IcarFilter {
    int maxSpeed;
    String color;
    int doors;

    public CarF(int maxSpeed, String color, int doors) {
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "CarF{" +
                "maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                '}';
    }

    @Override
    public List<CarF> filter(List<CarF> cars) {
        List<CarF> tempList = new ArrayList<>();
        cars.stream().filter( carF1 -> carF1.maxSpeed > 101 && carF1.doors > 2 ).forEach( o -> {
                    tempList.add( o );
                }
        );
        return tempList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarF carF = (CarF) o;
        return maxSpeed == carF.maxSpeed &&
                doors == carF.doors &&
                color.equals( carF.color );
    }

    @Override
    public int hashCode() {
        return Objects.hash( maxSpeed, color, doors );
    }
}