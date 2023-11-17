
import java.io.*;

public class PiramideRectangularRecta extends Figura{
    public PiramideRectangularRecta() {}

    @Override
    public float volumen() throws IOException {
    	double temp=0, temp2=0;
        main obj_main = new main();

        System.out.print("Longitud: ");
        float longitud = obj_main.leer(0);

        System.out.print("Ancho: ");
        float ancho = obj_main.leer(0);

        System.out.print("Altura: ");
        float altura = obj_main.leer(0);
        
        temp = (1.0/3.0);
        temp2 = longitud * ancho;
        temp = temp * temp2;
        temp *= altura;

        return (float) temp;
    }
}
