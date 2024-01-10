import java.util.Random;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


//        OperacionesArray.mostrar(OperacionesArray.cargar());
//        System.out.println();
//        OperacionesArray.mostrar(OperacionesArray.ordenar(OperacionesArray.cargar()));
//        System.out.println(OperacionesArray.media(OperacionesArray.cargar()));
//        System.out.println();
//        int [] array=OperacionesArray.cargar();
//        OperacionesArray.mostrar(array);
//        System.out.println();
//        OperacionesArray.invertir(array);


        int [] array=OperacionesArray.cargar();
        OperacionesArray.mostrar(array);
        System.out.println();
        System.out.println("Inserte un numero");
        int num= teclado.nextInt();
        System.out.println(OperacionesArray.contiene(array, num));



    }
}
