import java.util.Arrays;
import java.util.Scanner;

public class OperacionesString {



    public static void iniciales() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte un nombre");
        String nombre = teclado.nextLine();
        System.out.println("Inserte un apellido");
        String apellido = teclado.nextLine();

        System.out.println(nombre.charAt(0));
        System.out.println(apellido.charAt(0));

    }

    public static void concat() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte una frase");
        String nombre1 = teclado.nextLine();
        String nombre2 = teclado.nextLine();

        System.out.println(nombre1.toUpperCase().concat(nombre2.toUpperCase()));

    }

    public static void split() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte una frase");
        String frase = teclado.nextLine();

       String fraseSeparada[]= frase.split(" ");

        for (int i = 0; i < fraseSeparada.length; i++) {
            System.out.println(fraseSeparada[i]);

        }

    }

    public static String[] split  (String cadena) {
     String[] array = cadena.split(" ");
        return array;
    }

public static int aparece(String cadena, String palabra){

      String array[]=cadena.split(" ");
    int contador=0;

    for (int i = 0; i < array.length; i++) {
        if (array[i].contains(palabra)) {
             contador++;
        }

    }

    return contador;
}
}
