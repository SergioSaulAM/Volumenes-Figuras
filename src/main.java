import java.io.*;

public class main {
    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    public double leer(double val) throws IOException{
        val = Double.parseDouble(teclado.readLine());
        return val;
    }

    public int leer(int val) throws IOException {
        val = Integer.parseInt(teclado.readLine());
        return val;
    }
    public static void main(String[] args) throws IOException{
        main obj = new main();
        System.out.println("==================== V O L U M E N ====================");
        System.out.println("Elige un cuerpo geométrico para calcular su volumen");

        String[] geometricos = {
                "1. Cubo",
                "2. Cilindro",
                "3. Cono",
                "4. Prisma Rectangular Recto",
                "5. Pirámide Truncada",
                "6. Prisma Oblicuo",
                "7. Cilindro Hueco",
                "8. Cono Truncado",
                "9. Esfera",
                "10. Pirámide Rectangular Recta",
                "11. Segmento Esférico",
                "12. Segmento Esférico Truncado",
                "13. Sector Esférico",
                "14. Esfera con Perforación Cilíndrica",
                "15. Esfera con Perforación Cónica",
                "16. Toro",
                "17. Cilíndro con Corte Inclinado",
                "18. Cuña Cilíndrica",
                "19. Barril",
                "20. Prismatoide"
        };

        for (String posicion : geometricos) {
            System.out.println(posicion);
        }

        System.out.print("\nElige una opción: ");
        int opcion = obj.leer(0);

        Figura fig = null;
        String nombre = "";

        switch (opcion) {
            case 1:
                fig = new Cubo();
                nombre = "cubo";
                System.out.println("\nVolumen " + nombre + " = " + fig.volumen() + " u^3");
                break;
            case 2:
                fig = new Cilindro();
                nombre = "cilindro";
                System.out.println("\nVolumen " + nombre + " = " + fig.volumen() + " u^3");
                break;
            case 3:
                fig = new Cono();
                nombre = "cono";
                System.out.println("\nVolumen " + nombre + " = " + fig.volumen() + " u^3");
                break;
            case 4:
                fig = new PrismaRectangularRecto();
                nombre = "prisma rectangular recto";
                System.out.println("\nVolumen " + nombre + " = " + fig.volumen() + " u^3");
                break;
            case 5:
                fig = new PiramideTruncada();
                nombre = "pirámide truncada";
                System.out.println("\nVolumen " + nombre + " = " + fig.volumen() + " u^3");
                break;
            case 6:
                fig = new PrismaOblicuo();
                nombre = "prisma oblicuo";
                System.out.println("\nVolumen " + nombre + " = " + fig.volumen() + " u^3");
                break;
            case 7:
                fig = new CilindroHueco();
                nombre = "cilindro hueco";
                System.out.println("\nVolumen " + nombre + " = " + fig.volumen() + " u^3");
                break;
            case 8:
                fig = new ConoTruncado();
                nombre = "cono truncado";
                System.out.println("\nVolumen " + nombre + " = " + fig.volumen() + " u^3");
                break;
            case 9:
                fig = new Esfera();
                nombre = "esfera";
                System.out.println("\nVolumen " + nombre + " = " + fig.volumen() + " u^3");
                break;
            case 10:
                fig = new PiramideRectangularRecta();
                nombre = "pirámide rectangular recta";
                System.out.println("\nVolumen " + nombre + " = " + fig.volumen() + " u^3");
                break;
            case 11:
                fig = new SegmentoEsferico();
                nombre = "segmento esférico";
                System.out.println("\nVolumen " + nombre + " = " + fig.volumen() + " u^3");
                break;
            case 12:
                fig = new SegmentoEsfericoTruncado();
                nombre = "segmento esférico truncado";
                System.out.println("\nVolumen " + nombre + " = " + fig.volumen() + " u^3");
                break;
            case 13:
                fig = new SectorEsferico();
                nombre = "sector esférico";
                System.out.println("\nVolumen " + nombre + " = " + fig.volumen() + " u^3");
                break;
            case 14:
                fig = new EsferaPerforacionCilindrica();
                nombre = "esfera con perforación cilindrica";
                System.out.println("\nVolumen " + nombre + " = " + fig.volumen() + " u^3");
                break;
            case 15:
                fig = new EsferaPerforacionConica();
                nombre = "esfera con perforación cónica";
                System.out.println("\nVolumen " + nombre + " = " + fig.volumen() + " u^3");
                break;
            case 16:
                fig = new Toro();
                nombre = "toro";
                System.out.println("\nVolumen " + nombre + " = " + fig.volumen() + " u^3");
                break;
            case 17:
                fig = new CilindroCorteInclinado();
                nombre = "cilindro con corte inclinado";
                System.out.println("\nVolumen " + nombre + " = " + fig.volumen() + " u^3");
                break;
            case 18:
                fig = new CuniaCilindrica();
                nombre = "cuña cilíndrica";
                System.out.println("\nVolumen " + nombre + " = " + fig.volumen() + " u^3");
                break;
            case 19:
                fig = new Barril();
                nombre = "barril";
                System.out.println("\nVolumen " + nombre + " = " + fig.volumen() + " u^3");
                break;
            case 20:
                fig = new Prismatoide();
                nombre = "prismatoide";
                System.out.println("\nVolumen " + nombre + " = " + fig.volumen() + " u^3");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}
