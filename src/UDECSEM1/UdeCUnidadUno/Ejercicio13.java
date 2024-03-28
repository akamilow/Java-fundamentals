/*
Un programa que tras introducir una medida expresada en centímetros la convierta en pulgadas (1 pulgada = 2,54 centímetros)
*/
package UDECSEM1.UdeCUnidadUno;
import java.util.Scanner;

public class Ejercicio13 {
    static Scanner sc = new Scanner(System.in);
    static double cm;
    static double pulgadas;

    public static double cmAPulgadas() {
        return pulgadas = cm / 2.54;
    }
    public static void main(String[] args) {
        System.out.println("Ingresar medida en centrimetros");
        cm = sc.nextDouble();
        System.out.println("=============");
        System.out.println("Conversion de centimetros a pulgadas: " + cmAPulgadas());
    }
}
