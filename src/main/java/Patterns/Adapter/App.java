package Patterns.Adapter;

public class App {

    public static void main(String[] args) {
        System.out.println("реализация через наследование");
        VectorGraf vectorGraf = new AdapterRasterToVector();
        vectorGraf.drawVectorRound();
        vectorGraf.drawVectorSquare();
        System.out.println("реализация через композицию");
        VectorGraf vectorGraf1 = new AdapterRasterToVectorComp();
        vectorGraf1.drawVectorSquare();
        vectorGraf1.drawVectorRound();
    }
}
