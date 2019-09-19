package work.$pattern.$4ObjectPool;


import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {


    }
}

class Box{
    private int height;
    private int weight;

    public Box(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Box{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}

class BoxPool{
    private List boxUnused = new ArrayList();
    private List boxUsed = new ArrayList();

    void addBox (Box box){
        if(boxUnused.stream().anyMatch(o->o.equals(box))){
            System.out.println("такой box находится в unused");
        }else if  (boxUsed.stream().anyMatch(o->o.equals(box))){
            System.out.println("такой box находится в used");
        }else {
            boxUsed.add(box);
        }
    }



}