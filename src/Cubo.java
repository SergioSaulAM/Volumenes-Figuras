import java.io.*;

public class Cubo extends Figura{
    public Cubo() {}

    @Override
    public float volumen() throws IOException {
        main obj_main = new main();

        System.out.print("Lado: ");
        float lado = obj_main.leer(0);

        return (float) Math.pow(lado, 3);
    }
}
