package work.java_learn.$pattern.COMPLITE.$5Adapter;

public class Main3 {

    public static void main(String[] args) {

        VectorGraphics vectorGraphics = new Adapter2(new RasterGraphics());
        vectorGraphics.drawLine();

    }
}

interface VectorGraphics{
    void drawLine();
    void drawquare();
}

class RasterGraphics {
    void drawRasterLine(){
        System.out.println("рисуем линию растер");
    }

    void drawRasterSquare(){
        System.out.println("рисуем квадрат растер");
    }
}

class AdapterNEW extends RasterGraphics implements VectorGraphics{

    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawquare() {
        drawRasterSquare();
    }
}

class Adapter2 implements VectorGraphics{
RasterGraphics rasterGraphics;

    public Adapter2(RasterGraphics rasterGraphics) {
        this.rasterGraphics = rasterGraphics;
    }

    @Override
    public void drawLine() {
        rasterGraphics.drawRasterLine();
    }

    @Override
    public void drawquare() {
        rasterGraphics.drawRasterSquare();
    }
}