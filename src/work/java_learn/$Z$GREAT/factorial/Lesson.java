package work.java_learn.$Z$GREAT.factorial;

public class Lesson {

    public static void main(String[] args) {

//        Math.Factorial fact = Math.getFactorial( 6 ); //послали метод вернули new Factorial (конкретный экземпляр)
//        System.out.printf( "Факториал числа %d равен %d \n", fact.getKey(), fact.getResult() );

        int i = recursion(5);
    }


    public static int recursion(int n) {
        // условие выхода
        // Базовый случай
        // когда остановиться повторять рекурсию ?
        if (n == 1) {
            return 1;
        }
        // Шаг рекурсии / рекурсивное условие
        return recursion(n - 1) * n;
    }

}

class Math {

    public static class Factorial {

        private int result;
        private int key;

        public Factorial(int number, int x) {

            result = number;
            key = x;
        }

        public int getResult() {
            return result;
        }

        public int getKey() {
            return key;
        }
    }

    public static Factorial getFactorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return new Factorial( result, x );
    }


}
//y.replace( y.charAt( 0 ),Character.toUpperCase(y.charAt( 0 ) ));
