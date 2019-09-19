package work.$SE_Rabbit.lesson5;


import work.$SE_Rabbit.lesson25.DollySheet;

public class MainLesson25 {

    public static void main(String[] args) {

        DollySheet dollySheet = new DollySheet();
        DollySheet dollySheet2 = foo(dollySheet );

        dollySheet.setName( "Dolly" );
        dollySheet2.setName( "sheet" );

        System.out.println(dollySheet.getName());
        System.out.println(dollySheet2.getName());
    }

    public static DollySheet foo(DollySheet dollySheet2) {
        DollySheet sheet = null;
        try {
            sheet = (DollySheet) dollySheet2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();

        }
        return sheet;
    }
}

