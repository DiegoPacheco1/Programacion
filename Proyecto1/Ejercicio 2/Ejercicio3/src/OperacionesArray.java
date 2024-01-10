import java.util.Arrays;
import java.util.Random;

public class OperacionesArray {

    public static int[] cargar (){

        Random random=new Random();
        int array[]=new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextInt(100);
        }

        return array;
    }

    public static void mostrar (int[] x){

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+" ");
        }

    }


    public static int[] ordenar (int[] x){

        Arrays.sort(x);

        return x;
    }

    public static int media(int[] x){
        int saco=0;

        for (int i = 0; i < x.length; i++) {

            saco=saco+x[i];

        }
        saco=saco/x.length;

        return saco;
    }

    public static void invertir (int[] x){

        for (int i = x.length-1; i >=0 ; i--) {
            System.out.print(x[i]+" ");
        }
    }

public static boolean contiene (int[] x, int y){
boolean inside=false;

    for (int i = 0; i < x.length; i++) {
        if (x[i]==y){
            inside=true;
        }

    }
return inside;

}
}
