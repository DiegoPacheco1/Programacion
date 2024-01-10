package Ejercicio2;

import java.util.Random;
import java.util.Scanner;

public class Operacionestriangulo {
    Scanner teclado = new Scanner(System.in);
    Random random= new Random();

    private int cateto1;
    private int cateto2;
    private int hipotenussa;

    public Operacionestriangulo() {
        cateto1 = 4;
        cateto2 = 6;
        hipotenussa = 12;
    }

    public Operacionestriangulo(int cateto1, int cateto2, int hipotenussa) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.hipotenussa = hipotenussa;
    }

    public int getterC1() {
        return cateto1;
    }

    public int getterC2() {
        return cateto2;
    }

    public int getterHypo() {
        return hipotenussa;
    }

    public void setterC1(){
        System.out.print("Inserte el cateto 1:");
        this.cateto1=teclado.nextInt();
    }

    public void setterC2(){
        this.cateto2= random.nextInt(10);
    }

    public void setterHypo(int hipotenussa){
        this.hipotenussa=hipotenussa;
    }


    public int perimetro(){
        return cateto1+cateto2+hipotenussa;
    }
}
