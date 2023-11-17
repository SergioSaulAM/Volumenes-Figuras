
import java.io.*;
import java.math.*;

public class PiramideTruncada extends Figura{
    public PiramideTruncada () {}

    @Override
    public float volumen() throws IOException {
    	double temp=0, temp2=0, temp3=0;
        main obj_main = new main();

        System.out.print("Longitud 1: ");
        float longitud = obj_main.leer(0);
        System.out.print("Ancho 1: ");
        float Ancho = obj_main.leer(0);

        System.out.print("Longitud 2: ");
        float longitud2 = obj_main.leer(0);
        System.out.print("Ancho 2: ");
        float Ancho2 = obj_main.leer(0);

        System.out.print("Altura: ");
        float Altura = obj_main.leer(0);
        
        temp = longitud*Ancho;
        temp2 = longitud*Ancho2;
        temp = temp + temp2;
        temp3 = temp;
        temp = Math.sqrt(temp);
        
        temp2=Altura/3;
        temp3=temp3+temp;
        temp =temp2*temp3;

        return (float) temp;
    }
}
