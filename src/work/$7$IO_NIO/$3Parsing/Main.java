package work.$7$IO_NIO.$3Parsing;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("file1.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//
        Scanner scanner = new Scanner(bufferedReader);
        List<Employee> list = new ArrayList<>();

        //считываем CSV файл и парсим его в массив объектов
        /*

         * Андрей,20
         * Иван,25

        */
       scanner.useDelimiter("[^\\*\\s]*");
        while (scanner.hasNextLine()) {
            Employee emp = parseCSVLine(scanner.nextLine());
            list.add(emp);
        }
        scanner.close();
        list.forEach(o-> System.out.println(o));
    }

    private static Employee parseCSVLine(String line) {
        Scanner scanner = new Scanner(line);
        scanner.useDelimiter(",");
        String nameX = scanner.next();
        int ageB = scanner.nextInt();
        return new Employee(nameX, ageB);
    }
}

class Employee {
    private String nameX;
    private int ageB;

    public Employee(String x, int b) {
        this.nameX = x;
        this.ageB = b;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + nameX + '\'' +
                ", age=" + ageB +
                '}';
    }
}

