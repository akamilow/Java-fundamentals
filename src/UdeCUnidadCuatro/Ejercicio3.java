package UdeCUnidadCuatro;

import java.util.Scanner;

/*
Desarrollar un programa que almacena en un arreglo los números pares y
en otro los números impares comprendidos entre 1 y 100 e imprima esos
*/
public class Ejercicio3 {
    static Scanner sc = new Scanner(System.in);

    static int[] setArreglo() {
        int[] arreglo = new int[101];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i;
        }
        return arreglo;
    }

    static void getNumPares(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    static void getNumImpares(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] % 2 == 0)) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = setArreglo();
        getNumPares(arr);
        System.out.println("===================");
        getNumImpares(arr);
    }
}
