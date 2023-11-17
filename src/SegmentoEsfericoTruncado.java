
import java.io.*;

public class SegmentoEsfericoTruncado extends Figura{
    public SegmentoEsfericoTruncado() {}

    @Override
    public float volumen() throws IOException {
    	double temp=0, temp2=0, temp3=0;
        main obj_main = new main();

        System.out.print("Radio Superior: ");
        float radio_superior = obj_main.leer(0);

        System.out.print("Radio Interior: ");
        float radio_interior = obj_main.leer(0);

        System.out.print("Altura del Segmento: ");
        float altura_segmento = obj_main.leer(0);
        
        temp = 1.0/3;
        temp *= Math.PI;
        temp2 = radio_superior*radio_superior;
        temp3 = radio_superior*radio_interior;
        temp2= temp2 + temp3;
        temp3 = radio_interior * radio_interior;
        temp2= temp2 + temp3;
        temp = temp * temp2;
        temp *= altura_segmento;

        return (float) temp;
    }
}
