package work.$SE_Rabbit.lesson14;

public class MyArrays {
    int [] [] array3 = new int [2][2];
    int [] [] array4 = {{1,2},{3,4}};

    int[] array = new int[3];
    Candy[] box = new Candy[3];

    int[] array2 = {10, 3, 7};

    Candy candyFirst = new Candy();
    Candy candySecond = new Candy();
    Candy candyThird = new Candy();

    Candy[] box2 = {candyFirst, candySecond, candyThird};

    Candy[] box3;

    public void myAr() {

        for(int i=0; i<array2.length; i++){
            System.out.println(array2[i]);
        }

        System.out.println(box[0]);

        System.out.println(array4[0][0]);
        //    int [] [] array3 = new int [2][2];
        //    int [] [] array4 = {{1,2},{3,4}};
        //    1 2   00 01
        //    3 4   10 11
    }

}
