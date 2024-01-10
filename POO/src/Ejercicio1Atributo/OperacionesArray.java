package Ejercicio1Atributo;

import java.util.Arrays;
import java.util.Random;

public class OperacionesArray {
    Random random = new Random();
    private int[] array = new int[10];

    public void cargar() {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    public String mostrar() {
        return Arrays.toString(array);
    }

    public void ordenar() {
        Arrays.sort(array);
    }

    public void media() {
        int media = 0;

        for (int i = 0; i < array.length; i++) {
            media = media + array[i];
        }
        media = media / array.length;

        System.out.println("La media es: " + media);
    }

    public String invertir() {

        int[] array2 = Arrays.copyOf(array, array.length);

        for (int i = 0, j = 9; i < array.length; i++, j--) {
            array2[j] = array[i];
        }
        return Arrays.toString(array2);
    }
}
