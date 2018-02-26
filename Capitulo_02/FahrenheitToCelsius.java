
package Capitulo_02;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        float c;
        
        System.out.println("Dime los grados Fahrenheit: ");
        float f = teclado.nextFloat();
        c = (f - 32) * (5/9);
        System.out.println("La conversión final es: " + c);
    }
}

