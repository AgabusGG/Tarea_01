
package Capitulo_05;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        Integer num = teclado.nextInt();
        if(num % 2 == 0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
    }
}
