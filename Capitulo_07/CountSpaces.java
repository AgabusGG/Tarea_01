/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_07;
public class CountSpaces {

    public static void main(String[] args) {
        String MyString= "The person who says something is impossible should not interrupt the person who is doing it";
        
        char[] MiCadena= MyString.toCharArray();
        int n = 0;
        for (int i = 0 ; i < MiCadena.length; i++){
            if (MiCadena[i] == ' ' ){
                n++;
                
            }               
            
           
        }
        System.out.println(n);
    }
}
    