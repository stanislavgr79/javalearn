
package work.Solo.OOP;

public class OOP {
    public OOP() {
    }

    public static void main(String[] args) {





        Animal dog2 = new Dog( "","" );
        Animal cat = new Cat("","");
        String [] array = new String[2];
        cat.setName("Kyzia");cat.setColor( "red" );
        array[0]=cat.getName();array[1]=cat.getColor();
        String rez= "";
        for(int i=0; i<array.length; i++){
             rez+=array[i];
        }
        System.out.println("itogo " + rez);
        //dog.setName("Sharik");
        //cat.setName("Kyzia");
       // System.out.println(cat.getName() + " " + cat.getName());
        // System.out.println(cat.voice() + " " + cat.voice());
    }
}
