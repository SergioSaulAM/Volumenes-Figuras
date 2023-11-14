import java.io.*;
import java.math.*;

public class PrismaOblicuo extends Figura{
    public PrismaOblicuo () {}

    @Override
    public float volumen() throws IOException {
        main obj_main = new main();

        System.out.print("Longitud 1: ");
        double base1 = obj_main.leer(0);
        System.out.print("Ancho 1: ");
        double ancho1 = obj_main.leer(0);

        System.out.print("Longitud 2: ");
        double base2 = obj_main.leer(0);
        System.out.print("Ancho 2: ");
        double ancho2 = obj_main.leer(0);

        System.out.print("Altura: ");
        double altura = obj_main.leer(0);

        return (float)  ((base1 * ancho1 + base2 * ancho2) * altura / 2);
    }
}
