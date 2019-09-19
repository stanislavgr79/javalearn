package work.$Z$GREAT;

public class $1_equals {
    public static void main(String[] args) {

    }
}

class Point{
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

class Color{
    private String name;

    public Color(String name) {
        this.name = name;
    }
}

class ColorPoint{
    private Point point;
    private Color color;

    public ColorPoint(int x, int y, Color color) {
        this.point = new Point(x, y);
        this.color = color;
    }

    public Point asPoint(){
        return point;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof ColorPoint)) return false;

        ColorPoint cp = (ColorPoint) obj;
        return cp.point.equals(point) && cp.color.equals(color);
    }
}

class PhoneNomber {

    private final short areaCode, prefix, lineNum;
    public PhoneNomber( int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "areaCode");
        this.prefix = rangeCheck(prefix, 999, "prefix");
        this.lineNum = rangeCheck(lineNum, 9999, "lineNum");
    }

    private static short rangeCheck (int value, int max, String arg){
        if(value < 0 || value > max)
            throw new IllegalArgumentException(arg + ": " + value);
        return (short) value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneNomber)) return false;
        PhoneNomber that = (PhoneNomber) o;
        return areaCode == that.areaCode &&
                prefix == that.prefix &&
                lineNum == that.lineNum;
    }

    @Override
    public int hashCode() {
//        return Objects.hash(areaCode, prefix, lineNum);
        int result = Short.hashCode(areaCode);
        result = 31 * result * Short.hashCode(prefix);
//        result = 31 * result * Short.hashCode(lineNum);
        result = ((result<<5)-result) * Short.hashCode(lineNum);
        return result;
    }
}