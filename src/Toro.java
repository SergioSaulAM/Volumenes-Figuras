import java.io.*;

public class Toro extends Figura{
    public Toro() {}

    @Override
    public float volumen() throws IOException {
        main obj_main = new main();

        System.out.print("Radio mayor: ");
        float radioMayor = obj_main.leer(0);

        System.out.print("Radio menor: ");
        float radioMenor = obj_main.leer(0);

        return (float) ((2.0 / 3) * Math.PI * radioMayor * radioMenor * (radioMayor + radioMenor));
    }
}
