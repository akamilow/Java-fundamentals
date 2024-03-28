/*
Calcular el perímetro de un triángulo sabiendo los tres lados.
 */
package UDECSEM1.UdeCUnidadUno;
import java.util.Scanner;
public class Ejercicio5 {
    static Scanner sc = new Scanner(System.in);
    static double lado1;
    static double lado2;
    static double lado3;
    static double perimetroTriangulo;

    public static double perimetroTriangulo() {
        return perimetroTriangulo = lado1 + lado2 + lado3;
    }

    public static void main(String[] args) {
        System.out.println("Ingrese Lado 1");
        lado1 = sc.nextDouble();
        System.out.println("===============");
        System.out.println("Ingrese Lado 2");
        lado2 = sc.nextDouble();
        System.out.println("===============");
        System.out.println("Ingrese Lado 3");
        lado3 = sc.nextDouble();
        System.out.println("===============");
        System.out.println("PERIMETRO: " + perimetroTriangulo());
    }

}
