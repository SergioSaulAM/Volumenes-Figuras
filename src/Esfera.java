import java.io.IOException;

public class Esfera extends Figura{
    public Esfera() {}

    @Override
    public float volumen() throws IOException {
        main obj_main = new main();

        System.out.print("Radio: ");
        float radio = obj_main.leer(0);

        return (float) ((4.0 / 3) * Math.PI * radio * radio * radio);
    }
}
