package work.$SE_Rabbit.lesson30;

public class PerimeterSquare {

    public void getPerimeter(String str) throws PerimeterException {


        Square square = new Square();


        try {
            double side = Double.parseDouble( str );
            square.setSide(0);
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
            throw new PerimeterException( "String is incorrect", e,true,false);
        } catch (PerimeterException ex){
            System.out.println(ex.getMessage());
        }

    }
}
