package work.Solo.example;

public class Input extends Output{
  //  private int x, y;

  //  public Input(Output output) {
  //      x = output.getX();
  //      y = output.getY();
  //  }

  //  public void foo() {
  //      System.out.println( "!!" + (x + y) );

  //  }

    public int foo2(Output output) {
        int x, y;
        x = output.getX();
        y = output.getY();
        int c = x + y;
        return c;
    }

}