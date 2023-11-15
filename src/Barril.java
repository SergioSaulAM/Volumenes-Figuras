import java.io.*;
public class Barril extends Figura{
    public Barril() {}

    @Override
    public float volumen() throws IOException {
        double temp = 0, temp2 = 0;
        main obj_main = new main();

        System.out.print("Radio: ");
        float radio = obj_main.leer(0);

        System.out.print("Altura: ");
        float altura = obj_main.leer(0);

        System.out.print("Grosor: ");
        float grosor = obj_main.leer(0);

        temp = radio * radio;
        temp *= Math.PI;
        temp *= altura;
        temp2 = grosor / radio;
        temp *= 1 - Math.cos(temp2);

        return (float) temp;
    }
}
