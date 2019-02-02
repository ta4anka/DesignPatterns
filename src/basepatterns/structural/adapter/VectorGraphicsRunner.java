package basepatterns.structural.adapter;

public class VectorGraphicsRunner {
    public static void main(String[] args) {
        // 1st way
        VectorGraphicsInterface vectorGraphics= new FromRasterToVectorAdapter();
        vectorGraphics.drawLine();
        vectorGraphics.drawSquare();

        //2nd way
        VectorGraphicsInterface vectorGraphics2= new FromRasterToVectorAdapter2();
        vectorGraphics.drawLine();
        vectorGraphics.drawSquare();
    }
}

/*
It's line...
It's circle...
*/
