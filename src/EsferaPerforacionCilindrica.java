import java.io.*;

public class EsferaPerforacionCilindrica extends Figura{
    public EsferaPerforacionCilindrica() {}

    @Override
    public float volumen() throws IOException {
        double temp, temp2;
        main obj_main = new main();

        System.out.print("Radio de Esfera con Perforación: ");
        float radioEsferaPerforacion = obj_main.leer(0);

        System.out.print("Radio de Cilindro con Perforación: ");
        float radioCilindroPerforacion = obj_main.leer(0);

        System.out.print("Altura de Cilindro de Perforación: ");
        float alturaCilindroPerforacion = obj_main.leer(0);

        temp = 4.0 / 3;
        temp *= Math.PI;
        temp *= radioEsferaPerforacion;
        temp *= radioEsferaPerforacion;
        temp *= radioEsferaPerforacion;
        temp2 = Math.PI * radioCilindroPerforacion;
        temp2 *= radioCilindroPerforacion;
        temp2 *= alturaCilindroPerforacion;
        temp -= temp2;

        return (float) temp;
    }
}
