package Ejercicio1;

import java.util.Arrays;
import java.util.Random;

public class Operacionesarray {

    public static int[] cargararray() {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        return array;
    }
    public static void mostrar(int[] x) {

      System.out.println(Arrays.toString(x));
    }
    public static int[] ordenar(int[] x) {

        Arrays.sort(x);
        return x;
    }
    public static void media(int[] x) {
       double media = 0;

        for (int i = 0; i < x.length; i++) {
            media = media + x[i];
        }
        System.out.println("La media es: " + (media / x.length));
    }
    public static int[] invertir(int[] x) {

        int[] arrayInvertido = Arrays.copyOf(x, x.length);

        for (int i = x.length - 1, j = 0; i >= 0; i--, j++) {
            arrayInvertido[j] = x[i];
        }
        return arrayInvertido;
    }

}