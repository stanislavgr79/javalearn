package work.java_learn.$SE_Rabbit.lesson25;

public class DollySheet implements Cloneable{
    private String name;
    private Head head;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
