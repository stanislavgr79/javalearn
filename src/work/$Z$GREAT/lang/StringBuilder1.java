package work.$Z$GREAT.lang;

public class StringBuilder1 {

    public static void main(String[] args) {

        // append // set //charAt
        StringBuilder sb = new StringBuilder(90);
        sb.append( "this is " ).append( " a my house" );
        char a = Character.toUpperCase(sb.charAt( 0 ));
        sb.setCharAt( 0,a );
        System.out.println(sb);

        String asd = "67";
        Integer codepoint = Integer.parseInt(asd);
        System.out.println(codepoint);
        // append the codepoint to our StringBuilder
        sb.appendCodePoint(codepoint);
        System.out.println(sb);

        //capacity // length// the capacity becomes twice the current capacity plus
        int cap1 = sb.capacity();
        System.out.println(cap1);
        System.out.println(sb.length());
        sb.ensureCapacity(91);
        System.out.println(sb.capacity());

        //StringBuilder delete(int start, int end)  // deleteCharAt
        sb.delete( 1,2 );
        System.out.println(sb);
        sb.deleteCharAt( 2 );
        System.out.println(sb);


        // public int indexOf(String str, int fromIndex)
        // get the index of "a" string starting from index 10
        // substring ---- вырезать
        // lastindexof

        String str = "a";
        int fromIndex = 4;
        int index = sb.indexOf(str, fromIndex);
        System.out.println("index:" + index);
        String result = sb.substring(index,sb.length());
        System.out.println("Result:" + result);

        // initialize  object
        StringBuilder sb2 = new StringBuilder("javatutorialhq.com");
        System.out.println("Contents of buffer:" + sb2);

        // get the index of "a" string starting from index 10
        // from the StringBuilder object
        String str2 = "tut";
        int fromIndex2 = sb.length();
        int index2 = sb2.lastIndexOf(str2, fromIndex2);
        System.out.println("index:" + index2);

        /*
         * incorporate substring method. Get a part of StringBuilder
         * from the result of lastIndexOf
         * lookup until the end of this StringBuilder
         * */
        String result2 = sb2.substring(index2,sb2.length());
        System.out.println("Result:" + result2);


        ////public StringBuilder replace(int start, int end, String str)

        // Results:java
        CharSequence cs = sb2.subSequence(0, 4);
        System.out.println("Results:" + cs);

        char[] destinationArray = new char[10];
        for (int i = 0; i<10; i++) {
            destinationArray[i] = '*';}
        System.out.println(destinationArray);
    }

}
