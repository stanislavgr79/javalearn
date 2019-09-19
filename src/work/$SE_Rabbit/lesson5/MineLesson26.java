package work.$SE_Rabbit.lesson5;

public class MineLesson26 {

    public static void main(String[] args) {

        // String str1 = new String( "Hot, Java" );


        //    for(String element: str3){
        //       System.out.println(element);
        //    }

        //    str1.substring( 0,4 );
        //   System.out.println(str1.substring( 0,4 ));

        //  char[] array = str1.toCharArray();
        // for(char element: array){
        //    System.out.println(element);
        // }

        //   for (int i = 0; i < array.length; i++) {
        //   if (array[i] = Character.isUpperCase( array[i] ) ) {
        //       array[i+1]=Character.toUpperCase( array][i+1])

        //       if (Character.isUpperCase( array[i] ))
        //          array[i] = Character.toLowerCase( array[i] );
        //       else {
        //           array[i] = Character.toUpperCase( (array[i]) );
        //       }
        // i++;
        //     }
        //    String str6 = String.copyValueOf( array );
        //    System.out.println( str6 );


        // Character.toUpperCase( str3[0].charAt( 0 ) );
        //char a = 'j';
        //a=Character.toUpperCase(a );
        //System.out.println("a  " + a);
        //char a = str3[0].charAt( 0 );
        //a = Character.toUpperCase( a );
        // System.out.println( "a  " + a );
        // String b=String.valueOf( a );
        //str3[0].charAt( 0 )= b.charAt( 0 );


        //  str3[0]=str3[0].replace( str3[0].charAt( 0 ), a );

        String str1 = "hot, Java";
        System.out.println( "рабочая строка : " + str1 );
        String[] array = str1.split( " " ); // заполняем массив типа  string словами
        System.out.println( "после сплита первое поле массива : " + array[0] );
        System.out.println( "после сплита второе поле массива : " + array[1] );
        System.out.println( "количество полей массива типа string : " + array.length );
        System.out.println( "проверка первого символа нулевого поля : " + array[0].charAt( 0 ) );
        System.out.println( "проверка первого символа первого поля : " + array[1].charAt( 0 ) );

        for (int i = 0; i < array.length; i++) {
            if (Character.isLowerCase( array[i].charAt( 0 ) )) // Если первый символ поля нижнего регистра то True, и цикл выполняется
            {
                char x = array[i].charAt( 0 ); // тогда присваиваем его переменной х типа char
                x = Character.toUpperCase( x ); // меняем на верхний регистр символ в переменной х
                array[i] = array[i].replace( array[i].charAt( 0 ), x ); // заменяем символ в нулевой позиции нужного поля на значение х типа char
            }
        }
        System.out.println( "после цикла первое поле массива :" + array[0] );
        System.out.println( "после цикла второе поле массива :" + array[1] );
        System.out.println( "теперь нужно билдером вернуть из массива строки в одну строку" );

      //  StringBuilder builder = new StringBuilder();
      //  for (String s : array) {
      //      builder.append( s );
    //}
        String finalstring = String.join( " ", array ); // разделяем пробелами при импорте в строку, т.к. сплит разбил по пробелам
        System.out.println( "конечный результат :" + finalstring );


    }

}


//   }


//   if (array[0] != ' ') array[0] = Character.toUpperCase( array[0] );
//   for (int i = 0; i < array.length - 1; i++) {
//
//      if (array[i] == ' ' && array[i + 1] != ' ') {
//          array[i + 1] = Character.toUpperCase( array[i + 1] );
//       }
//
//    }

//    String rezarray = String.copyValueOf( array );
//    System.out.println( "!!!!!! " + rezarray );
//     if(Character.isUpperCase( array[0] )){


//   System.out.println(str1.toLowerCase());
//  System.out.println(str1.toUpperCase());

//   System.out.println(str1.trim());

//   System.out.println(String.valueOf(65));
//    String str4 = String.valueOf(65);

//   String str5 = String.copyValueOf( array );
//    System.out.println(str5);



