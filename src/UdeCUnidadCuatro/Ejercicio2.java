package UdeCUnidadCuatro;

import java.util.Scanner;

/*
2. Desarrollar un algoritmo que permita leer por pantalla 20 registros y
almacenarlos en un arreglo, e imprimir el arreglo.
*/

public class Ejercicio2 {
    static Scanner sc = new Scanner(System.in);
    static int[] arreglo = new int[21];

    static void setRegistros() {
        for (int i = 1; i < arreglo.length; i++) {
            System.out.println("Ingrese Registro N° "+i);
            arreglo[i] = sc.nextInt();
        }
    }

    static void getRegistros() {
        for (int i = 1; i < arreglo.length; i++) {
            System.out.println("Registro N°" + i + " = " + arreglo[i]);
        }
    }

    public static void main(String[] args) {
        setRegistros();
        getRegistros();
    }
}
