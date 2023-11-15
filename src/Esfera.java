import java.io.IOException;

public class Esfera extends Figura{
    public Esfera() {}

    @Override
    public float volumen() throws IOException {
        double temp;
        main obj_main = new main();

        System.out.print("Radio: ");
        float radio = obj_main.leer(0);

        temp = 4.0 / 3;
        temp *= Math.PI;
        temp *= radio;
        temp *= radio;
        temp *= radio;

        return (float) temp;
    }
}
