package work.java_learn.$pattern.$11FlyWeight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class test {

    public static void main(String[] args) {

        BoxFL boxFL = new BoxFL();
        Car car1 = boxFL.getCar("BMW");
        car1.id=2;
        System.out.println(car1);
        Car car2 = boxFL.getCar("BMW");
        System.out.println(car2);

    }
}

class Car{
    private String name;
    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class BoxFL{
    Map<String, Car> list = new HashMap<>();

    Car getCar (String name){
        Car car = new Car();
        if(list.containsKey(name)){
            car = list.get(name);
            return car;
        }else {
            car.setName(name);
            list.put(name, car);
            return car;
        }
    }

}