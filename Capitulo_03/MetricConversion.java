
package Capitulo_03;

import java.util.Scanner;

public class MetricConversion {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        Conversion c = new Conversion();
        System.out.println("Dime las pulgadas: ");
        Double iu = teclado.nextDouble();
        System.out.println("Dime los galones: ");
        Double gu = teclado.nextDouble();
        c.setI(iu);
        c.setG(gu);
        Double c1 = c.conversion1();
        Double c2 = c.conversion2();
        System.out.println("La conersión es: " + c1 + " cm " + "y " + c2 + " lts");
    }
}
