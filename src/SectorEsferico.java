
import java.io.IOException;

public class SectorEsferico extends Figura{
    public SectorEsferico() {}

    @Override
    public float volumen() throws IOException {
    	double temp=0;
        main obj_main = new main();

        System.out.print("Radio de Sector: ");
        float radio = obj_main.leer(0);

        System.out.print("Ángulo de Sector: ");
        float angulo = obj_main.leer(0);
        
        temp = 1.0/6;
        temp *= Math.PI;
        temp *= radio;
        temp *= radio;
        temp *= angulo;

        return (float) temp;
    }
}
