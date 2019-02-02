package basepatterns.structural.adapter;

// 2nd way - by using composition --> put instance of class RasterGraphics into class FromRasterToVectorAdapter2

public class FromRasterToVectorAdapter2 implements VectorGraphicsInterface{
RasterGraphics rasterGraphics = new RasterGraphics();
    @Override
    public void drawLine() {
        rasterGraphics.drawRasterLine();

    }

    @Override
    public void drawSquare() {
        rasterGraphics.drawRasterCircle();

    }
}
