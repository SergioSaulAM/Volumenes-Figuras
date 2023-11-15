import java.io.*;
public class CuniaCilindrica extends Figura{
    public CuniaCilindrica() {}

    @Override
    public float volumen() throws IOException {
        double temp, temp2;
        main obj_main = new main();

        System.out.print("Radio Cilíndrico de Cuña: ");
        float radio = obj_main.leer(0);

        System.out.print("Altura Cilíndrico de Cuña: ");
        float altura = obj_main.leer(0);

        System.out.print("Ángulo Cilíndrico de Cuña: ");
        float angulo = obj_main.leer(0);

        temp = 1.0 / 2;
        temp *= Math.PI;
        temp *= radio;
        temp *= radio;
        temp *= altura;
        temp2 = 1 - Math.cos(angulo);
        temp *= temp2;

        // return (float) ((1.0 / 2) * Math.PI * radio * radio * altura * (1 - Math.cos(angulo)));
        return (float) temp;
    }
}
