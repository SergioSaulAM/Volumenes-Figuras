
import java.io.*;

public class Toro extends Figura{
    public Toro() {}

    @Override
    public float volumen() throws IOException {
    	double temp=0, temp2=0;
        main obj_main = new main();

        System.out.print("Radio mayor: ");
        float radioMayor = obj_main.leer(0);

        System.out.print("Radio menor: ");
        float radioMenor = obj_main.leer(0);
        
        temp = 2.0/3;
        temp *= Math.PI;
        temp *= radioMayor;
        temp *= radioMenor;
        temp2 = radioMayor + radioMenor;
        temp = temp * temp2;

        return (float) temp;
    }
}
