import java.io.IOException;

public class CilindroHueco extends Figura{
    public CilindroHueco () {}

    @Override
    public float volumen() throws IOException {
        main obj_main = new main();

        System.out.print("Radio Exterior: ");
        float radioExterior = obj_main.leer(0);
        System.out.print("Radio Interior: ");
        float radioInterior = obj_main.leer(0);
        System.out.print("Altura: ");
        float altura = obj_main.leer(0);

        return (float) (Math.PI * (radioExterior * radioExterior - radioInterior * radioInterior) * altura);
    }
}
