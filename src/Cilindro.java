import java.io.*;

public class Cilindro extends Figura{
    public Cilindro() {}

    @Override
    public float volumen() throws IOException {
        main obj_main = new main();

        System.out.print("Altura: ");
        float altura = obj_main.leer(0);
        System.out.print("Radio: ");
        float radio= obj_main.leer(0);

        return (float) (Math.PI * radio * radio * altura);
    }
}