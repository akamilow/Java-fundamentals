/*
Desarrollar un algoritmo que lea por teclado un número y determina si el numero ingresado es par o impar.
 */
package UDECSEM1.UdeCUnidadDos;
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
        scanner.close();
    }
}