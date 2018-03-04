/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_04;

import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("INTRODUZCA EL TIPO DE SANGRE ");
        String tip=scan.next();
          System.out.println("INTRODUZCA factor: ");
        String fact=scan.next();
        BloodData bl = new BloodData(tip,fact);
        System.out.println(bl); 
    }
    
}

