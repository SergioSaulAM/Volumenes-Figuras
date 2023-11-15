import java.io.*;

public class Cubo extends Figura{
    public Cubo() {}

    @Override
    public float volumen() throws IOException {
        double temp;
        main obj_main = new main();

        System.out.print("Lado: ");
        float lado = obj_main.leer(0);

        temp = lado * lado;
        temp *= lado;

        return (float) temp;
    }
}
