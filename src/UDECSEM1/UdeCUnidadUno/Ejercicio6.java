/*
Convertir en grados Farengie el valor ingresado por teclado en grados Celcio
*/
// Formula = C = (°F - 32)) / 1.8
package UDECSEM1.UdeCUnidadUno;
import java.util.Scanner;

public class Ejercicio6 {
    static Scanner sc = new Scanner(System.in);
    static double Fahrenheit;
    static double Celsius;

    public static double FtoC() {
        return Celsius = (Fahrenheit - 32) / 1.8;
    }

    public static void main(String[] args) {
        System.out.println("Ingrese grados Fahrenheit");
        Fahrenheit = sc.nextDouble();
        System.out.println("==============");
        System.out.println("CONVERSION: " + FtoC() + " °C");
    }

}
