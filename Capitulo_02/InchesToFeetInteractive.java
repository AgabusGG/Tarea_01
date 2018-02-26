
package Capitulo_02;

import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las pulgadas: ");
        int i = teclado.nextInt();
        int r = i / 12;
        int r2 = i % r;
        System.out.println("El resultado es: " + r + " pies y "+ r2 + " pulgadas");
    }
}
