/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_07;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Alphabetize {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una palabra:  ");
        String p1 = teclado.next();
        System.out.println("Ingrese otra palabra:  ");
        String p2 = teclado.next();
        System.out.println("Ingrese otra palabra:  ");
        String p3 = teclado.next();
        ArrayList ordenar = new ArrayList<>();
        ordenar.add(p1);
        ordenar.add(p2);
        ordenar.add(p3);
        Collections.sort(ordenar);
        ordenar.forEach((Ordenados)->{System.out.println(Ordenados);});
            
        
   
    }
    
}
