package work.$SE_Rabbit.lesson20;

public enum Music {
    CLASSIC(5, "classic"), ROCK(6, "rock"), POP(7, "pop");

    private int i;
    private String name;

    Music (int i, String name){
        this.i = i;
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public String getName() {
        return name;
    }

    public void foo(){
        System.out.println("+++++++");
        System.out.println(Music.CLASSIC.getI());
    }

}
