package work.java_learn.$000$Exception;

public class Main1 {

    public static void main(String[] args) {

        Test test = new Test(-2, 4);
        try {
            int x = area(test);
            System.err.println(x);
        } catch (IllegalArgumentException e){
            System.err.println("bad " + e);;
        }
        finally {
            System.err.println("finally");
        }
        System.err.println("next");
    }


    static int area(Test test){
        if(test.weght<0 || test.height<0){
            throw new IllegalArgumentException("weight < 0 || height < 0 == true," +
                    " weight=" + test.weght +
                    " height=" + test.height
                    );
        }
        return test.height*test.weght;
    }

}

class Test{
    int weght;
    int height;

    public Test(int weght, int height) {
        this.weght = weght;
        this.height = height;
    }



}