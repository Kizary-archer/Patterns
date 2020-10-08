package Patterns.Adapter;

public class AdapterRasterToVector extends RasterGraf implements VectorGraf {

    @Override
    public void drawVectorSquare() {
       drowRasterSquare();
    }

    @Override
    public void drawVectorRound() {
        drowRasterRound();
    }
}
