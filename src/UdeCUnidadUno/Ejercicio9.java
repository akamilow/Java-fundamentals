/*
Un programa que escribe el porcentaje descontado en una compra, introduciendo por teclado el precio de la tarifa y el precio pagado.
*/
/*
Porcentaje Descontado = ((Precio Tarifa - Precio Pagado) / Precio Tarifa) * 100
*/
package UdeCUnidadUno;
import java.util.Scanner;

public class Ejercicio9 {
    static Scanner sc = new Scanner(System.in);
    static double precioTarifa;
    static double precioPagado;
    static double porcentaje;

    public static double porcentajeDescontado() {
        return porcentaje = ((precioTarifa - precioPagado) / precioTarifa) * 100;
    }

    public static void main(String[] args) {
        System.out.println("Ingrese precio de la tarifa");
        precioTarifa = sc.nextDouble();
        System.out.println("================");
        System.out.println("Ingrese precio pagado");
        precioPagado = sc.nextDouble();
        System.out.println("================");
        System.out.println("El Porcentaje descontado fue de: " + porcentajeDescontado() + "%");

    }
}
