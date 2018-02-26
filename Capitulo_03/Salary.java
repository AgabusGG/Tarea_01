
package Capitulo_03;

import java.util.Scanner;

public class Salary {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        Sa salario = new Sa();
        System.out.println("Dime el sueldo por hora: ");
        Double sal = teclado.nextDouble();
        System.out.println("Cuantas horas normales trabajó?: ");
        Double hn = teclado.nextDouble();
        System.out.println("Cuantas horas extras trabajó?: ");
        Double hes = teclado.nextDouble();
        salario.setP(sal);
        salario.setH(hn);
        salario.setHe(hes);
        Double pago1 = salario.pago();
        Double pago2 = salario.pago2();
        System.out.println("Salario normal: " + pago1);
        System.out.println("Salario extra: " + pago2);
    }
}
