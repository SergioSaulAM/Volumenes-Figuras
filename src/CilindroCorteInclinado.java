import java.io.*;
public class CilindroCorteInclinado extends Figura {
    public CilindroCorteInclinado() {}

    @Override
    public float volumen() throws IOException {
        main obj_main = new main();

        System.out.print("Radio Cilindro Corte Inclinado: ");
        float radio = obj_main.leer(0);

        System.out.print("Altura Cilindro Corte Inclinado: ");
        float altura = obj_main.leer(0);

        System.out.print("Ángulo de Corte Inclinado: ");
        float angulo = obj_main.leer(0);

        return (float) ((Math.PI * radio * radio * altura) * (1 - Math.cos(angulo)));
    }
}
