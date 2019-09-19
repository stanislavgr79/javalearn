package work.$pattern.$3Prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student st1 = new Student();
        st1.i=10;
        Cache cache = new Cache();
        Student prot = cache.getStudent(st1);
        System.out.println(prot.i);
        st1.i=88;
        System.out.println(st1.i +" " + prot.i);
        st1=cache.setStudent( prot );
        System.out.println(st1.i + " " + prot.i);

    }
}

class Student implements Cloneable{
     int i=5;

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}

class Cache{
    private Student student;

    public Student getStudent(Student student) throws CloneNotSupportedException {
        return student.clone();
    }

    public Student setStudent(Student student) {
        this.student = student;
        return this.student;
    }
}