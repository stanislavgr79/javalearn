package work.$Z$GREAT.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String animal0 = "frog";
        List <String> animals = new ArrayList(  );
        animals.add( "cat" );
        animals.add( "dog" );
        animals.add( 1, animal0 );


        String animal1 = animals.get( 0 );
//        System.out.println(animal1);
//
//        for(String  animal: animals){
//            System.out.println(animal);
//        }

        List<Animal> listofAnimal = new ArrayList<>(  );
        listofAnimal.add(new Animal(1));
        listofAnimal.add(new Animal(2));

        List<Dog> listofDogs = new ArrayList<>(  );
        listofDogs.add( new Dog() );
        listofDogs.add( new Dog() );


//         foo2(listofAnimal);
//         foo2(listofDogs);
    }

    public static void foo2(List<? extends Animal> listb){
        for(Animal animal: listb){
            animal.eat();
        }
    }

   // public static void foo(List<Animal> lista){
  //      for(Animal animal: lista){
   //         System.out.println(animal);
    //    }
  //  }


}

class Animal{
    public int id;

    Animal(){
    }

    public Animal(int id) {
        this.id = id;
    }

    public String toString (){
        return String.valueOf( id );
    }

    public void eat (){
        System.out.println("Animal eat ....");
    }
}
class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println(" dog eat///////");;
    }
}
