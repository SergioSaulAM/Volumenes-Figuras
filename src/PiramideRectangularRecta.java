import java.io.*;

public class PiramideRectangularRecta extends Figura{
    public PiramideRectangularRecta() {}

    @Override
    public float volumen() throws IOException {
        main obj_main = new main();

        System.out.print("Longitud: ");
        float longitud = obj_main.leer(0);

        System.out.print("Ancho: ");
        float ancho = obj_main.leer(0);

        System.out.print("Altura: ");
        float altura = obj_main.leer(0);

        return (float) (1 / 3) * (longitud * ancho) * altura;
    }
}
