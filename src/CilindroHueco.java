import java.io.IOException;

public class CilindroHueco extends Figura{
    public CilindroHueco () {}

    @Override
    public float volumen() throws IOException {
        double temp, temp2;
        main obj_main = new main();

        System.out.print("Radio Exterior: ");
        float radioExterior = obj_main.leer(0);
        System.out.print("Radio Interior: ");
        float radioInterior = obj_main.leer(0);
        System.out.print("Altura: ");
        float altura = obj_main.leer(0);

        temp = radioExterior * radioExterior;
        temp2 = radioInterior * radioInterior;
        temp -= temp2;
        temp *= Math.PI;
        temp *= altura;

        return  (float) temp;
    }
}
