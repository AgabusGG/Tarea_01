/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_07;
import java.util.Scanner;
public class FiveLettersAndFiveDigits {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba una palabra de 5 letras:  ");
        String p = teclado.next();
        char[]pl = p.toCharArray();
        if(pl.length<=5){
            System.out.println("Bien");
            
        }
        else{
            System.out.println("Mal");
        }
        
      
    }
    
}
