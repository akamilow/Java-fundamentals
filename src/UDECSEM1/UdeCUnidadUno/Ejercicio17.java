/*
Desarrollar un algoritmo que calcule e imprima el perímetro y el área de un rectángulo dada la longitud de dos de sus lados.
P = 2· a + 2· b
A= a · b
*/
package UDECSEM1.UdeCUnidadUno;
import java.util.Scanner;

public class Ejercicio17 {
    static Scanner sc = new Scanner(System.in);
    static double a, b;

    static void perimetroYArea() {
        System.out.print("Ingrese el valor de a: ");
        a = sc.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        b = sc.nextDouble();
        System.out.println("=================");
        System.out.println("Perímetro: " + (2 * a + 2 * b));
        System.out.println("=================");
        System.out.println("Área: " + (a * b));
    }

    public static void main(String[] args) {
        perimetroYArea();
    }
    
}
