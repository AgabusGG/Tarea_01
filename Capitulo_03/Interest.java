
package Capitulo_03;

import java.util.Scanner;

public class Interest {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        Intereses inte = new Intereses();
        System.out.println("Introduzca el monto de dinero: ");
        Double di = teclado.nextDouble();
        inte.setD(di);
        Double monto = inte.dinero();
        System.out.println("Su dinero inertido anualmente es de: " + monto);
        
    }
}
