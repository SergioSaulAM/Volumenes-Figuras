import java.io.*;
import java.math.*;

public class PrismaRectangularRecto extends Figura{
    public PrismaRectangularRecto(){}

    @Override
    public float volumen() throws IOException {
        main obj_main = new main();

        System.out.print("Lado: ");
        float lado = obj_main.leer(0);

        System.out.print("Ancho: ");
        float ancho = obj_main.leer(0);

        System.out.print("Altura: ");
        float altura = obj_main.leer(0);

        return (float)  lado * ancho * altura;
    }
}
