package UDECSEM1.UdeCUnidadCuatro;

import java.util.Scanner;

/*
2. Desarrollar un algoritmo que permita leer por pantalla 20 registros y
almacenarlos en un arreglo, e imprimir el arreglo.
*/

public class Ejercicio2 {
    // Se crea un objeto Scanner para entrada de datos desde la consola
    static Scanner sc = new Scanner(System.in);
    // Se declara un arreglo de enteros con capacidad para 21 elementos
    static int[] arreglo = new int[21];

    // Método para establecer los registros en el arreglo
    static void setRegistros() {
        for (int i = 1; i < arreglo.length; i++) {
            // Solicita al usuario ingresar el valor para cada registro en el arreglo
            System.out.println("Ingrese Registro N° "+i);
            arreglo[i] = sc.nextInt();
        }
    }

    // Método para obtener y mostrar los registros almacenados en el arreglo
    static void getRegistros() {
        for (int i = 1; i < arreglo.length; i++) {
            // Muestra en pantalla el valor de cada registro en el arreglo
            System.out.println("Registro N°" + i + " = " + arreglo[i]);
        }
    }

    // Método principal donde se ejecutan las funciones para establecer y obtener registros
    public static void main(String[] args) {
        setRegistros();// Llamada al método para ingresar los registros
        getRegistros();// Llamada al método para mostrar los registros ingresados

    }
}
