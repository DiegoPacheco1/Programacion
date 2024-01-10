import java.util.Arrays;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//
//        OperacionesString.iniciales();
//        OperacionesString.concat();


        /*Array de string*/

//        System.out.println("Inserte una frase");
//        String frase = teclado.nextLine();
//        String[] arrayFinal = OperacionesString.split(frase);
//        for (int i = 0; i < arrayFinal.length; i++) {
//            System.out.println(arrayFinal[i]);
//        }

        /*Un String dentro de otro*/

        System.out.println("Inserte una frase y luego la palabra que quieres saber si esta dentro de la frase y cuatas veces está");
        String frase1= teclado.nextLine();
        String palabra=teclado.next();
        System.out.println(OperacionesString.aparece(frase1, palabra));



    }
}
