package work.Solo;

import java.util.Scanner;

public class Alpha {
    public static char[] a;

    public Alpha() {
    }

    public static void main(String[] args) {
        int lit_s = 0;
        int lit_b = 0;
        Scanner in = new Scanner(System.in);
        a = new char[10];

        int i;
        for(i = 0; i < 5; ++i) {
            System.out.println("Введите символы");
            a[i] = in.next().charAt(0);
        }

        for(i = 0; i < 5; ++i) {
            if (a[i] >= 'a' && a[i] <= 'z') {
                ++lit_s;
            } else if (a[i] >= 'A' && a[i] <= 'Z') {
                ++lit_b;
            }
        }

        int rez = lit_s + lit_b;
        System.out.println("Big " + lit_b + "Small " + lit_s);
        System.out.println(rez * 2 + 1);
    }
}
