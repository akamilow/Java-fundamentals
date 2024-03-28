/*
Desarrollar un algoritmo que, dado el valor de x, y, z calcule e imprima el valor de A según la siguiente formula
A=2x2 y3 z

Mi comprension del ejercicio:
    - El usuario ingresa los valores de x, y, z
    - Formula = 2x^2 * y^3 * z
*/ 
package UDECSEM1.UdeCUnidadUno;
import java.util.Scanner;

public class Ejercicio19 {
    static Scanner sc = new Scanner(System.in);

    static void calcularA() {
        double x, y, z;
        System.out.print("Ingrese el valor de x: ");
        x = sc.nextDouble();
        System.out.print("Ingrese el valor de y: ");
        y = sc.nextDouble();
        System.out.print("Ingrese el valor de z: ");
        z = sc.nextDouble();
        System.out.println("=================");
        System.out.println("A: " + (2 * Math.pow(x, 2) * Math.pow(y, 3) * z));
    }

    public static void main(String[] args) {
        calcularA();
    }
}
