package work.$pattern.$11FlyWeight;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        FlyWeightGarage flyWeightGarage = new FlyWeightGarage();
        Mercedes mc1 = flyWeightGarage.getMercedes( "green" );
        mc1.setId( 1 );
        System.out.println(mc1);
        Mercedes mc2 = flyWeightGarage.getMercedes( "green" );
        mc2.setId( 2 );
        System.out.println(mc2.getId());
        System.out.println("!!!!!!!!");
        System.out.println(mc1.getId());
        flyWeightGarage.list.entrySet().stream().forEach( o-> System.out.println(o) );

    }
}


class Mercedes{
    private String color;
    private int id;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mercedes mercedes = (Mercedes) o;
        return color.equals( mercedes.color );
    }

    @Override
    public int hashCode() {
        return Objects.hash( color );
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "color='" + color + '\'' +
                ", id=" + id +
                '}';
    }
}

class FlyWeightGarage{
//    List<Mercedes> list = new ArrayList<>(  );
//
//    Mercedes getMercedes(String color1){
//        Mercedes mercedes = list.get( list.indexOf( list.stream().filter( o->o.color.equals(color1 ) ) ) );
//        return mercedes;
//    }
Map<String,Mercedes> list = new HashMap<>(  );

    Mercedes getMercedes(String color1){
        Mercedes mercedes = new Mercedes();
        if (list.containsKey( color1 )) {
            mercedes = list.get( color1 );
            return mercedes;
        }else{
            mercedes.setColor( color1 );
            list.put( color1,mercedes );
            return mercedes;
        }
    }
}