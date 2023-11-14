import java.io.*;

public class EsferaPerforacionCilindrica extends Figura{
    public EsferaPerforacionCilindrica() {}

    @Override
    public float volumen() throws IOException {
        main obj_main = new main();

        System.out.print("Radio de Esfera con Perforación: ");
        float radioEsferaPerforacion = obj_main.leer(0);

        System.out.print("Radio de Cilindro con Perforación: ");
        float radioCilindroPerforacion = obj_main.leer(0);

        System.out.print("Altura de Cilindro de Perforación: ");
        float alturaCilindroPerforacion = obj_main.leer(0);

        return (float) ((4.0 / 3) * Math.PI * radioEsferaPerforacion * radioEsferaPerforacion * radioEsferaPerforacion - Math.PI * radioCilindroPerforacion * radioCilindroPerforacion * alturaCilindroPerforacion);
    }
}
