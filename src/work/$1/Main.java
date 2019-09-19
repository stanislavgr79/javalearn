package work.$1;


import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
// создаем массив объектов Employee
        Employee[] empArr = new Employee[5];
// заполняем массив объектов Employee данными
        empArr[0] = new Employee(10, "Abdrew", 22, 10000);
        empArr[1] = new Employee(10, "Abdrew", 21, 10000);
        empArr[2] = new Employee(20, "Dmitriy", 49, 20000);
        empArr[3] = new Employee(5, "Viktor", 45, 5000);
        empArr[4] = new Employee(1, "Alex", 42, 50000);
// сортируем массив с использованием Comparable
//
        Comparator<Employee> comparatorName = (o1,o2) -> o1.getName().compareTo(o2.getName());
        Comparator<Employee> comparatorName2 = Comparator.comparing(Employee::getName);
        Comparator<Employee> comparatorAge = Comparator.comparingInt(Employee::getAge);
        Arrays.sort(empArr, comparatorName2.thenComparingInt(Employee::getAge));
        Stream.of(empArr).forEach(System.out::println);


    }
}


class Employee {

    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    // переопределим метод toString() для печати
    // информации об объекте Employee в читабельном виде
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name +
                ", age=" + this.age + ", salary=" + this.salary + "]";
    }
}