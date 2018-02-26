
package Capitulo_03;

import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        Paint p = new Paint();
        System.out.println("Dime la longitud: ");
        Double lo = teclado.nextDouble();
        System.out.println("Dime el ancho: ");
        Double an = teclado.nextDouble();
        System.out.println("Dime la altura: ");
        Double hi = teclado.nextDouble();
        p.setL(lo);
        p.setA(an);
        p.setH(hi);
        Double monto = p.calcularPrecio();
        System.out.println("El precio total es de: " + monto + "$");
    }
}
