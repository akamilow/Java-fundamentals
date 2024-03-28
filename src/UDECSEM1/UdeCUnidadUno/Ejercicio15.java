/*
Se desea saber cuál es el valor total para pagar de un artículo, sabiendo su valor por unidad y la cantidad de artículos a llevar. 
Desarrollar un programa que, dado el valor de unidad de un artículo y la cantidad de artículos, calcule el valor total y lo imprima.
*/
package UDECSEM1.UdeCUnidadUno;
import java.util.Scanner;

public class Ejercicio15 {
    static Scanner sc = new Scanner(System.in);

    public static void valorxUnidad() {
        System.out.println("Ingrese el valor de la unidad del articulo: ");
        double valorUnidad = sc.nextDouble();
        System.out.println("Ingrese la cantidad de articulos: ");
        int cantidad = sc.nextInt();
        double valorTotal = valorUnidad * cantidad;
        System.out.println("El valor total a pagar es: $" + valorTotal);
    }

    public static void main(String[] args) {
        valorxUnidad();
    }
}
