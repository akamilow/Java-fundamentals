package UdeCUnidadUno.Complementarios;
/*
Desarrolle el algoritmo de la empresa XYZ, que permita calcular la nómina semanal de 5 obreros, 
con la siguiente característica:
• Valor Hora 1000 pesos.
• Digitar el Número de Horas Trabajadas por semana por cada Obrero
• Calcular el valor a pagar por cada obrero
• Calcular el Valor Total Pagados a Todos los Obreros.
*/

import java.util.Scanner;

public class EjercicioC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorHora = 1000;
        System.out.println("==============");
        System.out.println("Ingrese horas semanales trabajadas por obreros");
        System.out.println("==============");
        System.out.println("horas semanales del obrero 1");
        int hTrabajoObrero1 = sc.nextInt();
        System.out.println("horas semanales del obrero 2");
        int hTrabajoObrero2 = sc.nextInt();
        System.out.println("horas semanales del obrero 3");
        int hTrabajoObrero3 = sc.nextInt();
        System.out.println("horas semanales del obrero 4");
        int hTrabajoObrero4 = sc.nextInt();
        System.out.println("horas semanales del obrero 5");
        int hTrabajoObrero5 = sc.nextInt();
        sc.close();
        System.out.println("==============");
        System.out.println("salario semanal por obreros");
        System.out.println("==============");
        int salarioObrero1 = hTrabajoObrero1 * valorHora;
        System.out.println("El salario del obrero 1 es: " + salarioObrero1);
        int salarioObrero2 = hTrabajoObrero2 * valorHora;
        System.out.println("El salario del obrero 2 es: " + salarioObrero2);
        int salarioObrero3 = hTrabajoObrero3 * valorHora;
        System.out.println("El salario del obrero 3 es: " + salarioObrero3);
        int salarioObrero4 = hTrabajoObrero4 * valorHora;
        System.out.println("El salario del obrero 4 es: " + salarioObrero4);
        int salarioObrero5 = hTrabajoObrero5 * valorHora;
        System.out.println("El salario del obrero 5 es: " + salarioObrero5);
        System.out.println("==============");
        System.out.println("Valor Total Pagados a Todos los Obreros");
        System.out.println("==============");
        int totalSalarios = salarioObrero1+salarioObrero2+salarioObrero3+salarioObrero4+salarioObrero5;
        System.out.println("Total es: " + totalSalarios);
    }
}
