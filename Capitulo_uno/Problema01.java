
package Capitulo_uno;

import java.util.Scanner;

public class Problema01 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Hola usuario, introduce una palabra: ");
        String palabra = teclado.next();
        if (palabra.equals("budgetApproval")){
          System.out.println("illegal");
        }
        if(palabra.equals("static")){
            System.out.println("illegal");     
        }
        if(palabra.equals("HELLO")){
            System.out.println("illega");     
        }
        if(palabra.equals("212AreaCode")){
            System.out.println("Illegal");     
        }
        if(palabra.equals("qhu6TRfg")){
            System.out.println("Illegal");     
        }
        if(palabra.equals("ssn#")){
            System.out.println("Illeal");     
        }
        if(palabra.equals("4999")){
            System.out.println("Illegal");     
        }
        if(palabra.equals("17")){
            System.out.println("Illegal");     
        }
        if(palabra.equals("Accounts_Receivable")){
            System.out.println("Legal");     
        }
        if(palabra.equals("32MPG")){
            System.out.println("Illegal");     
        }
        if(palabra.equals("rulesOfOrder")){
            System.out.println("Illegal");     
        }
    }
}
