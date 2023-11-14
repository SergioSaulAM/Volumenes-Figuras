import java.io.*;
public class CuniaCilindrica extends Figura{
    public CuniaCilindrica() {}

    @Override
    public float volumen() throws IOException {
        main obj_main = new main();

        System.out.print("Radio Cilíndrico de Cuña: ");
        float radio = obj_main.leer(0);

        System.out.print("Altura Cilíndrico de Cuña: ");
        float altura = obj_main.leer(0);

        System.out.print("Ángulo Cilíndrico de Cuña: ");
        float angulo = obj_main.leer(0);

        return (float) ((1.0 / 2) * Math.PI * radio * radio * altura * (1 - Math.cos(angulo)));
    }
}
