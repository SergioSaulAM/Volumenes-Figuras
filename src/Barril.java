import java.io.*;
public class Barril extends Figura{
    public Barril() {}

    @Override
    public float volumen() throws IOException {
        main obj_main = new main();

        System.out.print("Radio: ");
        float radio = obj_main.leer(0);

        System.out.print("Altura: ");
        float altura = obj_main.leer(0);

        System.out.print("Grosor: ");
        float grosor = obj_main.leer(0);

        return (float) ((Math.PI * radio * radio * altura) * (1 - Math.cos(grosor / radio)));
    }
}
