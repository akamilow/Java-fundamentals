/*
Calcular el área de un triángulo, sabiendo la base y la altura.
*/
package UdeCUnidadUno;
import java.util.Scanner;
public class Ejercicio4 {
    static Scanner sc = new Scanner(System.in);
    static double base;
    static double altura;
    static double area;

    public static double calcularArea() {
        return area = (base * altura) / 2;
    }
    
    public static void main(String[] args) {
        System.out.println("Ingrese Base");
        base = sc.nextDouble();
        System.out.println("===============");
        System.out.println("Ingrese Altura");
        altura = sc.nextDouble();
        System.out.println("===============");
        System.out.println("AREA: " + calcularArea());
    }
}
