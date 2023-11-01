/*
La empresa Prosegur tiene problema para calcular el salario neto a pagar a un empleado, 
desarrollar una solución algoritmo que permita calcular e imprimir el salario total, 
salario neto y el 5% del salario total como retención en la fuente, 
ingresando por teclado el valor de la hora y el número de horas trabajadas.
 */
package UdeCUnidadUno;
import java.util.Scanner;

public class Ejercicio1 {
    static Scanner sc = new Scanner(System.in);
    static double horasTrabajadas;
    static double valorHora;
    static double salarioTotal;
    static double salarioRetenido;
    static double salarioNeto;

    public static double calcularSalarioTotal(double horas, double valorHora) {
        salarioTotal = horas * valorHora;
        return salarioTotal;
    }
    
    public static double calcularRetencionFuente() {
        salarioRetenido = salarioTotal * 0.05;
        return salarioRetenido;
    }

    public static double calcularSalarioNeto() {
        salarioNeto = salarioTotal - salarioRetenido;
        return salarioNeto;
    }

    public static void main(String[] args) {
        System.out.println("ingrese horas trabajadas");
        horasTrabajadas = sc.nextDouble();
        System.out.println("ingrese valor por hora");
        valorHora = sc.nextDouble();

        System.out.println("==============");
        System.out.println("SALARIO TOTAL: $" + calcularSalarioTotal(horasTrabajadas, valorHora));
        System.out.println("==============");
        System.out.println("MONTO RETENIDO EN FUENTE: $" + calcularRetencionFuente());
        System.out.println("==============");
        System.out.println("SALARIO NETO: $" + calcularSalarioNeto());
    }
}
