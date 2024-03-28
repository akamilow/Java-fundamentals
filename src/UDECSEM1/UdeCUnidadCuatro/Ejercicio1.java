package UDECSEM1.UdeCUnidadCuatro;
/**
1. Desarrollar un algoritmo que permita almacenar en un arreglo los números
del 1 al 50 e imprima en pantalla lo que registro.
*/

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear un arreglo de enteros con capacidad para 51 elementos
        int[] arreglo = new int[51];

        // Llenar el arreglo con números del 0 al 50
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i;
        }

        // Imprimir los valores del arreglo, comenzando desde el índice 1 hasta el último índice
        // (El índice 0 no se imprime)
        for (int i = 1; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
        }
    }
}
