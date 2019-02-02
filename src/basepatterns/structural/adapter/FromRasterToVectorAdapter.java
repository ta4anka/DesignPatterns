package basepatterns.structural.adapter;

// 1st way - by using inheritance (class RasterGraphics)
public class FromRasterToVectorAdapter extends RasterGraphics implements VectorGraphicsInterface {
    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterCircle();
    }
}
