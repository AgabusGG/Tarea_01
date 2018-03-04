
package Capitulo_04;

import java.util.Scanner;

public class Main_Billing {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el precio: ");
        Double pre= scan.nextDouble();
        System.out.println("Introduzca cantidad predida: ");
        Double cape= scan.nextDouble();
        System.out.println("Introduzca can del cupon: ");
        Double cup= scan.nextDouble();
        Billing b = new Billing (pre,cape,cup);
        Double r=b.computeBill(pre, cape, cup);
        System.out.println(r);
        
    }
}
