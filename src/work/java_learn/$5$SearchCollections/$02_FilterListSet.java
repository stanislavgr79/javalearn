package work.java_learn.$5$SearchCollections;

import java.util.*;
import java.util.stream.Collectors;

public class $02_FilterListSet {

    public static void main(String[] args) {

        List<Employee> list = Employee.buildEmployeeList();
        List<String> filterName = Employee.employeeNameFilter();
        List<Employee> finalList = new ArrayList<>();
        List<Employee> finalList2 = new ArrayList<>();


        for (Employee employee : list) {
            for (String name : filterName) {
                if (employee.getName().equalsIgnoreCase(name)) {
                    finalList.add(employee);
                }
            }
        }
//        finalList2 = list.stream().filter(o-> filterName.stream().anyMatch(q->o.getName().equals(q))).collect(Collectors.toList());

        Set<String> nameFilterSet = Employee.employeeNameFilter().stream().collect(Collectors.toSet());
        finalList2 = list.stream().filter(o-> nameFilterSet.contains(o.getName())).collect(Collectors.toList());

        finalList2.forEach(o-> System.out.println(o));

    }

}

class Employee {

    private Integer employeeNumber;
    private String name;
    private Integer departmentId;

    public Employee(Integer employeeNumber, String name, Integer departmentId) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.departmentId = departmentId;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeNumber, employee.employeeNumber) &&
                Objects.equals(name, employee.name) &&
                Objects.equals(departmentId, employee.departmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeNumber, name, departmentId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber=" + employeeNumber +
                ", name='" + name + '\'' +
                ", departmentId=" + departmentId +
                '}';
    }

    public static List<Employee> buildEmployeeList() {
        return Arrays.asList(
                new Employee(1, "Mike", 1),
                new Employee(2, "John", 1),
                new Employee(3, "Mary", 1),
                new Employee(4, "Joe", 2),
                new Employee(5, "Nicole", 2),
                new Employee(6, "Alice", 2),
                new Employee(7, "Bob", 3),
                new Employee(8, "Scarlett", 3));
    }

    public static List<String> employeeNameFilter() {
        return Arrays.asList("Alice", "Mike", "Bob", "Joe");
    }

}