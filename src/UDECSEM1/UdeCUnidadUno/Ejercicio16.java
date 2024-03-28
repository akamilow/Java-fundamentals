/*
Desarrollar un algoritmo que dado el radio de un círculo calcule e imprima el área.

A = Pi x R^2
*/
package UDECSEM1.UdeCUnidadUno;
import java.util.Scanner;

public class Ejercicio16 {
    static Scanner sc = new Scanner(System.in);

    public static void radioCirculo() {
        System.out.println("Ingrese el radio del circulo:");
        double radio = sc.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo con radio: " + radio + " es de: " + area);
    }

    public static void main(String[] args) {
        radioCirculo();
    }
    
}
