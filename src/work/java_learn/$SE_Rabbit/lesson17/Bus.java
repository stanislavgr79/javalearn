package work.java_learn.$SE_Rabbit.lesson17;



public class Bus {
    public String model, color;
    public Engine engine;
    public Transmition transmition;
    public final String SERIAL_NUMBER = "12345";
    public final int SERIAL_NUMBER2 = 12345;

    public void go (){
        System.out.println("go");

    }

    public String showKM() {
       int km = 65;
        String str = "70km";
        return str;
    }

    public void showKM2 (int km2){
       km2 = km2 + 2;
        System.out.println(km2);
    }

    public void showKM3Str (String n){
        n = n + 2;
        System.out.println(n);
    }
}
