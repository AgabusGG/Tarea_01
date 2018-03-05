
package Capitulo_07;

import java.util.Scanner;
public class BabyNameComparison {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Primer nombre:  ");
        String pn = teclado.next();
        System.out.print("Segundo nombre:  ");
        String sn = teclado.next();
        System.out.print("Tercer nombre:  ");
        String tn = teclado.next();
        
        System.out.println(pn + " " + sn);
        System.out.println(pn + " " +tn);
        System.out.println(sn + " " + tn);
        System.out.println(sn + " " + pn);
        System.out.println(tn + " " + pn);
        System.out.println(tn + " " + sn);
        
    }
    
}
