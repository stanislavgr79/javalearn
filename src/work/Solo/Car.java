package work.Solo;

public abstract class Car {

    private Colors colors;
    private String type;
    private Integer speed;

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Car(Colors colors, String type) {
        this.colors = colors;
        this.type = type;
    }

    public void drive(){
        int is=50;
        setSpeed( is );
        System.out.println("vzik 50");
        //return is;
    }

}
