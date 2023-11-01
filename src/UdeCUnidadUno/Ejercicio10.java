/*
Un programa que reciba por teclado el precio de un artículo y calcule cual es el valor pagado por el iva de ese artículo.
*/
package UdeCUnidadUno;
import java.util.Scanner;

public class Ejercicio10 {
    static Scanner sc = new Scanner(System.in);
    static double precioArticulo;
    static double ivaPrecioArticulo; // El monto del iva con base en precio original 
    static double iva = 0.19;
    static double precioTotal;

    public static double calcularIva() {
        ivaPrecioArticulo = precioArticulo * iva;
        return precioTotal = ivaPrecioArticulo + precioArticulo;
    }

    public static void main(String[] args) {
        System.out.println("Ingresar precio del articulo");
        precioArticulo = sc.nextDouble();
        System.out.println("=============");
        System.out.println("Precio del articulo con iva 19% incluido: $" + calcularIva());
    }
}
