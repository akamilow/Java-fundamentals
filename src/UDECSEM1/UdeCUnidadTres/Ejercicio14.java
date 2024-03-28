package UDECSEM1.UdeCUnidadTres;

import java.util.Scanner;

/*
Desarrollar un algoritmo que permita calcular si un numero ingresa por teclado es perfecto o no. 
(Consultar el concepto de número perfecto).
 */
public class Ejercicio14 {
    public static int sumaDivisores(int num, int divisor) {
        if (divisor == 1) {
            return 1;
        } else if (num % divisor == 0) {
            return divisor + sumaDivisores(num, divisor - 1);
        } else {
            return sumaDivisores(num, divisor - 1);
        }
    }

    public static boolean esNumeroPerfecto(int num) {
        int suma = sumaDivisores(num, num - 1);
        return suma == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        scanner.close();
        if (esNumeroPerfecto(numero)) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }
    }
}
