
package Capitulo_02;

import java.util.Scanner;

public class DogBoarding {
    public static void main(String[]args){
        double t = 0;
        double tt = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce cuantas libras pesa tu perro: ");
        int peso = teclado.nextInt();
        System.out.println("Cuántos días se quedrá?");
        int d = teclado.nextInt();
        t = peso * .50;
        tt = t * d;
        System.out.println("El precio total es de: " + tt);
    }
}
