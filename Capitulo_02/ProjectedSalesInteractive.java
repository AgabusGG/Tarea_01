
package Capitulo_02;

import java.util.Scanner;

public class ProjectedSalesInteractive {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        double i = .10;
        double r = 0;
        System.out.println("Introduce el valor inicial");
        double s = teclado.nextDouble();
        r = i * s;
        System.out.println("El incremento e de: " + r);
    }
}
