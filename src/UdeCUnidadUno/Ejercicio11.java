/*
Un programa que pida por teclado dos números enteros y muestre su suma, resta, multiplicación, división y el resto (módulo) de la división.
*/
package UdeCUnidadUno;
import java.util.Scanner;
public class Ejercicio11 {
    static Scanner sc = new Scanner(System.in);
    static int num1, num2;

    public static int suma() {
        return num1 + num2;
    }

    public static int resta() {
        return num1 - num2;
    }

    public static int multi() {
        return num1 * num2;
    }

    public static double div() {
        return num1 / num2;
    }

    public static double mod() {
        return num1 % num2;
    }

    public static void main(String[] args) {
        System.out.println("Ingrese primer número: ");
        num1 = sc.nextInt();
        System.out.println("----------------");
        System.out.println("Ingrese segundo número: ");
        num2 = sc.nextInt();
        System.out.println("----------------");
        System.out.println("Suma: " + suma());
        System.out.println("----------------");
        System.out.println("Resta: " + resta());
        System.out.println("----------------");
        System.out.println("Multiplicación: " + multi());
        System.out.println("----------------");
        System.out.println("División: " + div());
        System.out.println("----------------");
        System.out.println("Módulo: " + mod());
    }
    
}
