package work.java_learn.$pattern.$31TransfertObject;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BusinessObject businessObject = new BusinessObject();
        List myObject = businessObject.getUsers();
        myObject.forEach( System.out::println );

    }
}

//Transfer object
class User{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class User2{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Service {
    public User getUser(){
        return new User();
    }

    public User2 getUser2(){
        return new User2();
    }

}

class BusinessObject{
    Service service = new Service();

    public List<Object> getUsers(){
        List<Object> arr = new ArrayList<>(  );
        arr.add(service.getUser());
        arr.add(service.getUser2());
        return arr;
    }
}