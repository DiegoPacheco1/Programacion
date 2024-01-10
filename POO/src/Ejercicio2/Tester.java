package Ejercicio2;

public class Tester {
    public static void main(String[] args) {

        Operacionestriangulo triangulo = new Operacionestriangulo();

        System.out.println(triangulo.getterC1());
        System.out.println();
        System.out.println(triangulo.getterC2());
        System.out.println();
        System.out.println(triangulo.getterHypo());
        System.out.println();
        triangulo.setterC1();
        triangulo.setterC2();
        triangulo.setterHypo(12);
        System.out.println();
        System.out.println(triangulo.getterC1());
        System.out.println();
        System.out.println(triangulo.getterC2());
        System.out.println();
        System.out.println(triangulo.getterHypo());
        System.out.println();
        System.out.println(triangulo.perimetro());

    }
}
