package work.java_learn.$pattern.$8Composite;

public class Main2 {

    public static void main(String[] args) {

    }
}

class Potpie{
    private int date;
    private int month;
    private int year;

    public Potpie(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }
}

class Test{
    private String name;
    private Potpie potpie;

    public Test(String name, Potpie potpie) {
        this.name = name;
        this.potpie = potpie;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", potpie=" + potpie +
                '}';
    }
}