package work.java_learn.$SE_Rabbit.lesson5;


public class MineLesson27 {

    public static void main(String[] args) {
    String str = new String( "New" );
    StringBuilder stringBuilder = new StringBuilder( "Java" );
   // stringBuilder.ensureCapacity( 20 );
        System.out.println(str.concat( " Hot" ));
        System.out.println(str);
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.append( " Hot" ));
        System.out.println(stringBuilder);
       // stringBuilder.setLength( 44 );
        System.out.println(stringBuilder.capacity());

        stringBuilder.insert( 1,"G" );
        System.out.println(stringBuilder);
        stringBuilder.deleteCharAt( 1 );
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}