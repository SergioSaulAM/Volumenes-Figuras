
import java.io.*;
public class SegmentoEsferico extends Figura{
    public SegmentoEsferico() {}

    @Override
    public float volumen() throws IOException {
    	double temp=0;
        main obj_main = new main();

        System.out.print("Radio: ");
        float radio = obj_main.leer(0);

        System.out.print("Altura de segmento: ");
        float altura_segmento = obj_main.leer(0);
        
        temp = 1.0/3;
        temp *= Math.PI;
        temp *= radio;
        temp *= radio;
        temp *= altura_segmento;

        return (float) temp;
    }
}
