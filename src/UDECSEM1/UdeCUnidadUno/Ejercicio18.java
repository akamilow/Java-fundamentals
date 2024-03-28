/*
Desarrollar un algoritmo que calcule e imprima el perímetro y el área de un cuadrado dado uno de sus lados
P = 4 · a
A = a^2
*/
package UDECSEM1.UdeCUnidadUno;
import java.util.Scanner;

public class Ejercicio18 {
    static Scanner sc = new Scanner(System.in);
    static double a;

    static void perimetroYArea() {
        System.out.print("Ingrese el valor de a: ");
        a = sc.nextDouble();
        System.out.println("=================");
        System.out.println("Perímetro: " + (4 * a));
        System.out.println("=================");
        System.out.println("Área: " + (a * a));
    }

    public static void main(String[] args) {
        perimetroYArea();
    }
    
}
