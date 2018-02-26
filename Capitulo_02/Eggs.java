
package Capitulo_02;

import java.util.Scanner;

public class Eggs {
  public static void main(String[]aargs){
      Scanner teclado = new Scanner(System.in);
      int d = 0;//docenas
      double d2 = 0;//docenas * 3.25
      double rs = 0;//resultado de huevo suelto
      double t = 0;
      System.out.println("Cuantos huevos compró?");
      int huevo = teclado.nextInt();
      int s = huevo % 12;//huevo suelto
      if(huevo > 12){
          d = huevo / 12;
          if(s != 0){
              rs = s * .45;
          }
          d2 = d * 3.25;
          t = d2 + rs;
      }else{
          t = huevo * 3.25;
      }
      System.out.println("Ordenaste " + huevo +" huevos. Que son " + d +" docenas a $3.25 por docena y "+ s +" huevos sueltos a 45.0 centavos cada uno por un total de " + t);
  }   
}
