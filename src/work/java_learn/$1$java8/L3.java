package work.java_learn.$1$java8;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class L3 {
    static Optional<Object> optional = Optional.ofNullable( (Object) get0() );

    //    static Optional<Object> optional2 = Optional.ofNullable( null );
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
//        list.add( "one" );
//        list.add( "two" );
        list.stream().forEach( o -> System.out.println( o ) );

        Map<String, String> map = new HashMap<>();
        map.put( "one", "book1" );

        Set<Object> set = list.stream().filter( (k) -> k.equals( "one" ) ).collect( Collectors.toSet() );
        list.stream().map( x -> x.toUpperCase() ); //преобразование
//        list.stream().flatMap(  )
        int count = Stream.of( 6 ).reduce( 6, (acc, element) -> acc * element );
        System.out.println( count );

        List<String> list3 = Stream.of( Arrays.asList( "one", "two" ), Arrays.asList( "free", "four" ) ).flatMap( x -> x.stream() ).collect( Collectors.toList() );
        System.out.println( list3.size() );
        List stringList = Stream.of( "one", "two" ).map( y -> y.replace( y.charAt( 0 ), Character.toUpperCase( y.charAt( 0 ) ) ) ).collect( Collectors.toList() );
        stringList.forEach( o -> System.out.println( o ) );

        String str1 = "hot, java";
        str1 = Stream.of( str1.split( " " ) ).map( y -> y.replace( y.charAt( 0 ), Character.toUpperCase( y.charAt( 0 ) ) ) ).collect( Collectors.joining( " " ) );

        IntStream intStream = Stream.of( 1, 2 ).mapToInt( x -> x );
        int s = intStream.summaryStatistics().getMax();
        int[] arr1 = new int[]{1, 2, 3};
        double z = Arrays.stream( arr1 ).summaryStatistics().getAverage();
        System.out.println( z );
        List<CarB> listq = new ArrayList<>();

        listq.add( new CarB( "Volvo V41", "XYA 201845", 5 ) );
        listq.add( new CarB( "Volvo V40", "XYA 201845", 3 ) );
        listq.add( new CarB( "Citroen C1", "ZBC 164521", 4 ) );
        listq.add( new CarB( "Citroen C1", "DBC 164521", 4 ) );
        listq.add( new CarB( "Citroen C1", "ABC 164524", 4 ) );
        listq.add( new CarB( "Citroen C1", "ABC 164521", 4 ) );
        listq.add( new CarB( "Dodge Ram", "KLM 845990", 2 ) );
//        Stream.of( listq ).collect( Collectors.toCollection( ArrayList::new ) );

        Comparator<CarB> torLambda = (car1, car2) -> car1.brand.compareTo( car2.brand )
                & car1.noOfDoors-car2.noOfDoors;

        Object o = get0();
        o.hashCode();

        Supplier<Stream<String>> supplier = ()->Stream.of( "a", "b", "c" );
        supplier.get().forEach( x-> System.out.println(x) );
        supplier.get().forEach( x-> System.out.println(x) );

    }

    static Object get0() {
//        return optional;
        return Optional.empty();
    }

}

class CarB {

    public String brand;
    public String numberPlate;
    public int noOfDoors;

    public CarB(String brand, String numberPlate, int noOfDoors) {
        this.brand = brand;
        this.numberPlate = numberPlate;
        this.noOfDoors = noOfDoors;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public String getBrand() {
        return brand;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", numberPlate='" + numberPlate + '\'' +
                ", noOfDoors=" + noOfDoors +
                '}';
    }
}