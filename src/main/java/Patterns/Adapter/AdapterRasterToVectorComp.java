package Patterns.Adapter;

public class AdapterRasterToVectorComp implements VectorGraf {

    RasterGraf rasterGraf = new RasterGraf();

    @Override
    public void drawVectorSquare() {
       rasterGraf.drowRasterSquare();
    }

    @Override
    public void drawVectorRound() {
        rasterGraf.drowRasterRound();
    }
}
