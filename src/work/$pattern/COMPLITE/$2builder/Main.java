package work.$pattern.COMPLITE.$2builder;

public class Main {

    public static void main(String[] args) {
        Home home = new Home.Builder("grodno").setFamily("my").doHome();
        System.out.println(home);

    }
}

class Home{
    private String name;
    private String family;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public int getAge() {
        return age;
    }

    public Home(Builder builder) {
        this.name = builder.name;
        this.family = builder.family;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "Home{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder{
        private String name;
        private String family;
        private int age;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setFamily(String family) {
            this.family = family;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        Home doHome(){
            return new Home(this);
        }
    }

}