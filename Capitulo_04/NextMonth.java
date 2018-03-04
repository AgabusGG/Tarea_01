/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_04;

import java.util.Scanner;

public class NextMonth {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Intruzca el dia");
        Integer dd=scan.nextInt();
        
       
        GregorianCalendar g = new GregorianCalendar(dd);
        g.getDia();
      
        System.out.println(g);
        
    }
}
