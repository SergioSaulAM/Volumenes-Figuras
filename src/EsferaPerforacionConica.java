import java.io.*;

public class EsferaPerforacionConica extends Figura{
    public EsferaPerforacionConica() {}

    @Override
    public float volumen() throws IOException {
        main obj_main = new main();

        System.out.print("Radio de esfera con perforación: ");
        float radio = obj_main.leer(0);

        System.out.print("Radio de cono de perforacion 1: ");
        float radioCono1 = obj_main.leer(0);

        System.out.print("Altura de cono de perforacion 1: ");
        float alturaCono1 = obj_main.leer(0);

        System.out.print("Radio de cono de perforacion 2: ");
        float radioCono2 = obj_main.leer(0);

        System.out.print("Altura de cono de perforacion 2: ");
        float alturaCono2 = obj_main.leer(0);

        return (float) ((4.0 / 3) * Math.PI * radio * radio * radio
                - (1.0 / 3) * Math.PI * radioCono1 * radioCono1 * alturaCono1
                - (1.0 / 3) * Math.PI * radioCono2 * radioCono2 * alturaCono2);
    }
}
