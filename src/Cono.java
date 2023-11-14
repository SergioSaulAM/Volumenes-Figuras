import java.io.IOException;

public class Cono extends Figura{
    public Cono() {}

    public float volumen() throws IOException {
        main obj_main = new main();

        System.out.print("Altura: ");
        float altura = obj_main.leer(0);

        System.out.print("Radio: ");
        float radio = obj_main.leer(0);

        return (float) ((1.0 / 3) * Math.PI * radio * radio * altura);
    }
}
