package UdeCUnidadTres;
import java.util.Scanner;
/*
Crear un programa que permita calcular la raíz cuadrada de un numero
Solucion internet
*/
public class Ejercicio12 {

    public static double calcularRaizCuadrada(double numero) {
        return calcularRaizCuadradaRecursiva(numero, numero / 2);
    }

    public static double calcularRaizCuadradaRecursiva(double numero, double estimacion) {
        double nuevaEstimacion = (estimacion + numero / estimacion) / 2;
        if (Math.abs(nuevaEstimacion - estimacion) < 0.00001) {
            return nuevaEstimacion;
        } else {
            return calcularRaizCuadradaRecursiva(numero, nuevaEstimacion);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número para calcular su raíz cuadrada: ");
        double numero = scanner.nextDouble();
        scanner.close();
        
        if (numero < 0) {
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
        } else {
            double resultado = calcularRaizCuadrada(numero);
            System.out.println("La raíz cuadrada de " + numero + " es aproximadamente: " + resultado);
        }
    }
}
