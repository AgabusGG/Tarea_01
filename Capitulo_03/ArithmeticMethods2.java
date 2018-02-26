
package Capitulo_03;

import java.util.Scanner;

public class ArithmeticMethods2 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        MetArit operacion = new MetArit();
        System.out.println("Dime un numero: ");
        Integer n = teclado.nextInt();
        operacion.setNum(n);
        Integer re1 = operacion.sumaUno();
        Integer re2 = operacion.sumaDos();
        Integer re3 = operacion.sumaTres();
        System.out.println("La primer suma es: " + re1);
        System.out.println("La segunda suma es: " + re2);
        System.out.println("La tercera suma es: " + re3);
    }
}
