import java.io.*;
public class SegmentoEsferico extends Figura{
    public SegmentoEsferico() {}

    @Override
    public float volumen() throws IOException {
        main obj_main = new main();

        System.out.print("Radio: ");
        float radio = obj_main.leer(0);

        System.out.print("Altura de segmento: ");
        float altura_segmento = obj_main.leer(0);

        return (float) ((1.0 / 3) * Math.PI * radio * radio * altura_segmento);
    }
}
