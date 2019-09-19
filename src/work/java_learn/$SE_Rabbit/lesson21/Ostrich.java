package work.java_learn.$SE_Rabbit.lesson21;

public class Ostrich extends Birds{
    public Ostrich(String name) {
        super(name);
    }



    public void hideHead (){
        System.out.println("hide head");
    }

   // public void walk(String str){
   //     System.out.println("Ho" + " " + str);
   // }


    @Override
    public void walk() {
        System.out.println("ostrich");;
    }
}
