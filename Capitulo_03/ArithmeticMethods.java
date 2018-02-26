
package Capitulo_03;

public class ArithmeticMethods {
    public static void main(String[]args){
        MetArit operacion = new MetArit();
        Integer n = 15;
        operacion.setNum(n);
        Integer re1 = operacion.sumaUno();
        Integer re2 = operacion.sumaDos();
        Integer re3 = operacion.sumaTres();
        System.out.println("La primer suma es: " + re1);
        System.out.println("La segunda suma es: " + re2);
        System.out.println("La tercera suma es: " + re3);
    }
}
