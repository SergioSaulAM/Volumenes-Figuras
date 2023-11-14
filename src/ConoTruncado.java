import java.io.*;
import java.math.*;

public class ConoTruncado extends Figura{
    public ConoTruncado() {}

    @Override
    public float volumen() throws IOException {
        main obj_main = new main();

        System.out.print("Radio Superior: ");
        float radioSuperior = obj_main.leer(0);

        System.out.print("Radio Interior: ");
        float radioInferior = obj_main.leer(0);

        System.out.println("Altura: ");
        float altura = obj_main.leer(0);

        return (float) ((1.0 / 3) * Math.PI * (radioSuperior * radioSuperior + radioSuperior * radioInferior + radioInferior * radioInferior) * altura);
    }
}
