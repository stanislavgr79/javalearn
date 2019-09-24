package work.Solo;

public enum Colors {
    RED("Red",01),
    BLUE("Blue", 02),
    WHITE("White", 03);

    private final String colorName;
    private final int idColor;

    Colors(String colorName, int idColor) {
        this.colorName = colorName;
        this.idColor = idColor;
    }

    public String getColorName() {
        return colorName;
    }

    public int getIdColor() {
        return idColor;
    }

    public void showColor_id(){
        System.out.println(getColorName() + " " + getIdColor());
    }

}
