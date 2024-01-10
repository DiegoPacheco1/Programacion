package Ejercicio1;

import java.lang.reflect.Array;

public class Tester {


    public static void main(String[] args) {

        int[] array= Operacionesarray.cargararray();

        Operacionesarray.mostrar(array);
        System.out.println();
        Operacionesarray.mostrar(Operacionesarray.ordenar(array));
        System.out.println();
        Operacionesarray.media(array);
        System.out.println();
        Operacionesarray.mostrar(Operacionesarray.invertir(array));
    }



}
