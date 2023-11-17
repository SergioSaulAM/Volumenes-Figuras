

import java.io.*;

public class EsferaPerforacionConica extends Figura{
    public EsferaPerforacionConica() {}

    @Override
    public float volumen() throws IOException {
    	double temp=0, temp2=0, temp3=0;
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
        
        temp = 4.0/3;
        temp *= Math.PI;
        temp *= radio;
        temp *= radio;
        temp *= radio;
        temp2 = 1.0/3;
        temp2 *= Math.PI;
        temp2 *= radioCono1;
        temp2 *= radioCono1;
        temp2 *= radioCono1;
        temp3 = 1.0/3;
        temp3 *= Math.PI;
        temp3 *= radioCono2;
        temp3 *= radioCono2;
        temp3 *= radioCono2;
        temp = temp -temp2;
        temp = temp -temp3;

        return (float) temp;
    }
}
