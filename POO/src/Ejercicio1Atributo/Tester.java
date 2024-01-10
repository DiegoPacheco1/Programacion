package Ejercicio1Atributo;

public class Tester {
    public static void main(String[] args) {
        OperacionesArray nuevo = new OperacionesArray();

        nuevo.cargar();
        System.out.println(nuevo.mostrar());
        System.out.println();
        nuevo.ordenar();
        System.out.println(nuevo.mostrar());
        System.out.println();
        nuevo.media();
        System.out.println();
        System.out.println(nuevo.invertir());

    }


}
