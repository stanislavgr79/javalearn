package work.$Z$GREAT.lesson6_anyobj_to_1met;

public class Enum1 {


    public static void main(String[] args) {

        Operation sum = Operation.SUM;
        System.out.println( sum.action( 10, 4 ) );   // 14
        Operation multiply = Operation.MULTIPLY;
        System.out.println( multiply.action( 6, 4 ) );    // 24
    }
}

enum Operation {
    SUM {
        public int action(int x, int y) {
            return x + y;
        }
    },
    SUBTRACT {
        public int action(int x, int y) {
            return x - y;
        }
    },
    MULTIPLY {
        public int action(int x, int y) {
            return x * y;
        }
    };

    public abstract int action(int x, int y);
}



