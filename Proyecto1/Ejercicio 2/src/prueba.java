public class prueba {
    public static void main(String[] args) {

      int array[]= rellenarNumeros(10);
      imprimirArray(array);



    }
    
    public static void imprimirArray (int[] lista){

        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
            
        }
        
    }

    public static int[] rellenarNumeros(int a) {

        int array[]= new int [10];

        for (int i = 0; i < array.length; i++) {
            array[i]=a;
            a++;
        }

        return array;
    }
}
