
package Capitulo_02;

import java.util.Scanner;

public class MilesToFeet {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        double m = 5280;
        double r = 0;
        System.out.println("Cuantas millas hay entre tu casa y la de tu tio?");
        double miles = teclado.nextDouble();
        r = miles * m;
        System.out.println("La distancia en millas es: " + miles + " o en pies: " + r);
    }
}
