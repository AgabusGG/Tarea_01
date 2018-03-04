
package Capitulo_06;

import java.util.Scanner;

public class CollegeCost {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int edad; 
        float dinero;
        do{
            System.out.println("Dime la edad del niño: ");
            edad = teclado.nextInt();
            System.out.println("Cuanto dinero quiere aorrar de aquí a que el niña tenga 18?");
            dinero = teclado.nextFloat();
            int anios = 0;
            float aa = 0;
            if(edad < 18){
               anios = 18 - edad;
               aa = dinero / anios;
                System.out.println("El aorro anual debe ser de "+aa);
            }else{
                System.out.println("Edad incorrecta, intente de nuevo.");
            }
        }while(edad >= 18);
    }
}
