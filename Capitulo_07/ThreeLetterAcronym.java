/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_07;

import java.util.Scanner;

public class ThreeLetterAcronym {

    public static void main(String[] args) {
        System.out.println("Ingrese la primera palabra:  ");
        Scanner teclado = new Scanner (System.in);
        String primera = teclado.next();
        System.out.println("Ingrese la segunda palabra:  ");
        String segunda = teclado.next();
        System.out.println("Ingrese la tercera palabra:  ");
        String tercera = teclado.next();
        char[] a = primera.toCharArray();
        char[] b = segunda.toCharArray();
        char[] c = tercera.toCharArray();
        System.out.println(a[0] + " " + b[0] + " " + c[0]);
        
    }
    
}
