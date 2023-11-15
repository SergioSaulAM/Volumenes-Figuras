import java.io.*;
import java.math.*;

public class ConoTruncado extends Figura{
    public ConoTruncado() {}

    @Override
    public float volumen() throws IOException {
        double temp, temp2, temp3;
        main obj_main = new main();

        System.out.print("Radio Superior: ");
        float radioSuperior = obj_main.leer(0);

        System.out.print("Radio Interior: ");
        float radioInferior = obj_main.leer(0);

        System.out.print("Altura: ");
        float altura = obj_main.leer(0);

        temp = radioSuperior * radioSuperior;
        temp2 = radioSuperior * radioInferior;
        temp3 = radioInferior * radioInferior;

        temp += temp2;
        temp += temp3;
        temp *= altura;
        temp *= Math.PI;
        temp *= 1.0 / 3;

        return (float) temp;
    }
}
