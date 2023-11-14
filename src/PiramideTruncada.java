import java.io.*;
import java.math.*;

public class PiramideTruncada extends Figura{
    public PiramideTruncada () {}

    @Override
    public float volumen() throws IOException {
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

        float g = (float) Math.sqrt((longitud*Ancho)+(longitud2*Ancho2));

        return (float) (Altura/3)*((longitud*Ancho)+(longitud2*Ancho2)+g);
    }
}
