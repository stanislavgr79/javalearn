package work.java_learn.$pattern.$24MVC;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.execute();
    }
}
// выгребает данные из модели и помещает во вьюху
class Controller{
    // выгреб данные - нужно заинжектать - поместить в наш контроллер I-n-C + вьюшка I-n-C
    IModelLayer iModelLayer = new DBaseLayer();
    ViewKindOf view = new ViewS();

    void execute(){
        Student student = iModelLayer.getStudent();
        view.showStudent( student );
    };

}
interface ViewKindOf{
    void showStudent(Student student);
}

class ViewS implements ViewKindOf{

    @Override
    public void showStudent(Student student) {
        System.out.println("Student :" + student);
    }
}


// модель - интерфейс + КОНКРЕТНЫЙкласс со своей имплементацией СПОСОБА выгребания
// выгребает интерфейс
interface IModelLayer{
    Student getStudent();
}

// в связке с классом из базыКласса Student
class DBaseLayer implements IModelLayer{

    @Override
    public Student getStudent() {
        return new Student( "Alex", 22 );
    }
}

// база данных сеть файлы чтоугодно
class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


