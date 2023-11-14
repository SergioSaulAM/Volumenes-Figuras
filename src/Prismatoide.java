import java.io.*;
public class Prismatoide extends Figura {
    public Prismatoide() {}

    @Override
    public float volumen() throws IOException {
        main obj_main = new main();

        System.out.print("Número de lados: ");
        int lados = obj_main.leer(0);

        System.out.println("Ingrese las longitudes de las aristas\n");

        double[] longitudes = new double[lados];
        for (int i = 0; i < longitudes.length; i++) {
            System.out.print("Ingresa la longitud del lado " + (i + 1) + ": ");
            longitudes[i] = obj_main.leer(0);
        }

        System.out.print("Área de la base: ");
        float areaBase = obj_main.leer(0);

        System.out.print("Áltura del barril: ");
        float altura = obj_main.leer(0);

        return areaBase * altura;
    }
}
