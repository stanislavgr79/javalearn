package work.$Z$GREAT.comparator;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    //    ComparePerson comparePerson = new ComparePerson();
//    static Comparator<Person4> comparatorAge = (t1, t2) -> t1.getAge() - t2.getAge();
    //        Comparator<Person4> comparatorAge = Comparator.comparingInt( Person4::getAge );
//    static Comparator<Person4> comparatorName = Comparator.comparing( Person4::getName );


    //       Set <Person4> set = new TreeSet<Person4>(comparatorAge.thenComparing( comparatorName ));
//    public static Set<Person4> set = new TreeSet<Person4>( comparatorAge.thenComparing( comparatorName ) );

    public static void main(String[] args) {

////
//        set.add( new Person4( 3, "Petrov" ) );
//        set.add( new Person4( 2, "Ivanov" ) );
//        set.add( new Person4( 2, "Avanov" ) );
//        set.add( new Person4( 6, "Diakov" ) );
//        set.add( new Person4( 9, "Sidorov" ) );
//        set.add( new Person4( 9, "Sadorov" ) );
//
////        Stream<Person4> set2 = set.stream().sorted( comparatorAge );
////        Set set3 = set2.collect( Collectors.toSet() );
//        Person4 workPerson = (Person4) search2( set, "Diakv" );
//        System.out.println( workPerson );
//
//
//        //////////////////////
        List<Car> list = new ArrayList<>();
        list.add( new Car( "Volvo V40", "XYZ 201845", 5 ) );
        list.add( new Car( "Volvo V41", "XYA 201845", 5 ) );
        list.add( new Car( "Volvo V40", "XYA 201845", 3 ) );
        list.add( new Car( "Citroen C1", "ZBC 164521", 4 ) );
        list.add( new Car( "Citroen C1", "DBC 164521", 4 ) );
        list.add( new Car( "Citroen C1", "ABC 164524", 4 ) );
        list.add( new Car( "Citroen C1", "ABC 164521", 4 ) );
        list.add( new Car( "Dodge Ram", "KLM 845990", 2 ) );

//        Comparator<Person4> comparatorAge = (t1, t2) -> t1.getAge() - t2.getAge();
        //        Comparator<Person4> comparatorName = Comparator.comparingInt( Person4::getAge );
//    static Comparator<Person4> comparatorName = Comparator.comparing( Person4::getName );

        List <Car> list1 = asf( list );
        list1.forEach( System.out::println );

        Comparator<Car> carda = (car1, car2) -> car1.brand.compareTo( car2.brand ) & car1.noOfDoors - car2.noOfDoors;

//        Stream.of( list ).sorted(Comparator.comparingInt( Car::getNoOfDoors)).;



////        Comparator<Car> carBrandComparator = new Comparator<Car>() {
////            @Override
////            public int compare(Car car1, Car car2) {
////                return car1.brand.compareTo( car2.brand );
////            }
////        };
//
//
        Comparator<Car> carBrandComparatorLambda = (car1, car2) -> car1.brand.compareTo( car2.brand ) & car1.noOfDoors - car2.noOfDoors;
//        Comparator<Car> carNumberPlatComparatorLambda = (car1, car2) -> car1.numberPlate.compareTo( car2.numberPlate );
//        Comparator<Car> carNoOfDoorsComparatorLambda = (car1, car2) -> car1.noOfDoors - car2.noOfDoors;
//
//        list.sort( carBrandComparatorLambda.thenComparing( carNumberPlatComparatorLambda ) );
////        list.sort( carNumberPlatComparatorLambda );
////        list.sort( carNoOfDoorsComparatorLambda );
//
//
//        perform( list, "Volvo V41", 9 );
//        for (Object o2 : list) {
//            System.out.println( o2 + " index: " + list.indexOf( o2 ) );

//        Class clss = Car.class;
////            Class clss = Car.getClass();
//        System.out.println( clss.getSimpleName() );
//
//        System.out.println( "Constructor" );
//        Constructor[] constructors = clss.getDeclaredConstructors();
//        for (Constructor constructor : constructors) {
//            System.out.println( constructor.getName() );
//            Parameter[] parameter = constructor.getParameters();
//            for (Parameter parameter1 : parameter) {
//                System.out.println( parameter1.getType().getName() );
//            }
////                System.out.println( Modifier.toString( constructor.getModifiers() ) );
//        }
//        System.out.println( "" );
//        System.out.println( "methods" );
//        Method[] methods = clss.getDeclaredMethods();
//        for (Method method : methods) {
//            System.out.println( " method.getName() :" + method.getName() );
//            Parameter[] parameters = method.getParameters();
//            for (Parameter parameter : parameters) {
//                System.out.println( "||||parameter.getName() :" + parameter.getName() );
//                System.out.println( "parameter.getType().getName() :" + parameter.getType().getName() );
//                System.out.println( "parameter.getModifiers() :" + parameter.getModifiers() );
//            }
//        }
    }


    public static List<Car> perform(List<Car> list, String searchName, int noDoors) {
        List<Car> temp = new ArrayList<>();
        list.stream().filter( o -> o.getBrand().equals( searchName ) & o.noOfDoors > 2 ).forEach( o -> {
                    temp.add( o );
                }
        );
        return temp;
    }

    public static Object search(Set<Person4> anyset, String searchName) {
        Person4 object = null;
        for (Person4 o : anyset) {
            if (o.getName().equals( searchName )) object = (Person4) o;
        }
        return object;
    }

    public static Object search2(Set<Person4> anyset, String searchName) {
        Person4 object = null;
        if (anyset.stream().anyMatch( nameTemp -> nameTemp.getName().equals( searchName ) )) {
            for (Person4 o : anyset) {
                if (o.getName().equals( searchName )) object = (Person4) o;
            }
        } else {
            System.out.println( "Doesnt have this " + searchName + " person in set" );
        }
        return object;
    }

   static List<Car> asf(List<Car> cars){
        List list2 = cars.stream()
                .sorted( Comparator.comparing(Car::getBrand).thenComparingInt(Car::getNoOfDoors  ) )
                .collect( Collectors.toList());
        return list2;
    }
}


//class ComparePerson implements Comparator<Person4> {
//
////    @Override
////    public int compare(Person4 t1, Person4 t2) {
////        return t1.getAge() - t2.getAge();
////    }
//}

class Person4 {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person4(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person4{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class Car {

    public String brand;
   static public String numberPlate;
    public int noOfDoors;

    public Car(String brand, String numberPlate, int noOfDoors) {
        this.brand = brand;
        this.numberPlate = numberPlate;
        this.noOfDoors = noOfDoors;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public  int getNoOfDoors() {
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
Main main = new Main();
    List<Car> asf(List<Car> cars){
        List list2 = cars.stream()
                .sorted( Comparator.comparingInt( Car::getNoOfDoors ).thenComparing( Car::getBrand ) )
                .collect( Collectors.toList());
        return list2;
    }

}