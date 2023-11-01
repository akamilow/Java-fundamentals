/*
Un empleado gana en su salario total mensual $1.056.028, 
si trabajo un total de 36 horas, calcular una solución algorítmica que permita imprimir cual es el valor de una hora trabajada.
 */
package UdeCUnidadUno;
public class Ejercicio2 {
    static double salarioTotal = 1056028;
    static int horasTrabajadas = 36;
    static double valorHora = salarioTotal / horasTrabajadas;;

    public static void main(String[] args) {
        System.out.println("VALOR POR HORA: $" + valorHora);
    }
}
