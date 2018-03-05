/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_07;
public class DemonstratingStringMethods {


    public static void main(String[] args) {
        
        String quote = "You can never cross the ocean until you have the courage to lose sight of the shore";
        quote.indexOf('v');
        quote.indexOf('x');
        quote.charAt(16);
        quote.endsWith("bus");
        quote.endsWith("car");
        quote.replace('c', 'C');
        System.out.println(quote);
    }

    
    
}
