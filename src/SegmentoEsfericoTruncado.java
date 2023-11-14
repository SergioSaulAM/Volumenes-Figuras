import java.io.*;

public class SegmentoEsfericoTruncado extends Figura{
    public SegmentoEsfericoTruncado() {}

    @Override
    public float volumen() throws IOException {
        main obj_main = new main();

        System.out.print("Radio Superior: ");
        float radio_superior = obj_main.leer(0);

        System.out.print("Radio Interior: ");
        float radio_interior = obj_main.leer(0);

        System.out.print("Altura del Segmento: ");
        float altura_segmento = obj_main.leer(0);

        return (float) ((1.0 / 3) * Math.PI * (radio_superior * radio_superior + radio_superior * radio_interior + radio_interior * radio_interior) * altura_segmento);
    }
}
