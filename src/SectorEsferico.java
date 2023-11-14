import java.io.IOException;

public class SectorEsferico extends Figura{
    public SectorEsferico() {}

    @Override
    public float volumen() throws IOException {
        main obj_main = new main();

        System.out.print("Radio de Sector: ");
        float radio = obj_main.leer(0);

        System.out.print("Ángulo de Sector: ");
        float angulo = obj_main.leer(0);

        return (float) ((1.0 / 6) * Math.PI * radio * radio * angulo);
    }
}
