/*
Convertir en grados Celsius el valor ingresado por teclado en grados Fahrenheit
*/

// °F = (°C x 9/5) + 32
package UdeCUnidadUno;
import java.util.Scanner;

public class Ejercicio7 {
    static Scanner sc = new Scanner(System.in);
    static double Celsius, Fahrenheit;

    public static double CtoF() {
        return Fahrenheit = (Celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        System.out.println("Ingrese los grados Celsius:");
        Celsius = sc.nextDouble();
        System.out.println("==============");
        System.out.println("CONVERSION: " + CtoF() + " °F");
    }
}
