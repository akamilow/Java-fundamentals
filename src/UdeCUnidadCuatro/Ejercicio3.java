package UdeCUnidadCuatro;

import java.util.ArrayList;

/*
Desarrollar un programa que almacena en un arreglo los números pares y
en otro los números impares comprendidos entre 1 y 100 e imprima esos
*/

public class Ejercicio3 {
    // Se crean dos ArrayList para almacenar números pares e impares respectivamente
    static ArrayList<Integer> arrPares = new ArrayList<Integer>();
    static ArrayList<Integer> arrImpares = new ArrayList<Integer>();

    // Método para crear un arreglo de 101 elementos con valores del 0 al 100
    static int[] setArreglo() {
        int[] arreglo = new int[101];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i;
        }
        return arreglo;
    }

    // Método para separar números pares e impares y almacenarlos en los ArrayList correspondientes
    static void getNums(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                // Si el número es par, se agrega al ArrayList de números pares
                arrPares.add(arr[i]);
                System.out.println("Es par: "+arr[i]);
            } else { 
                // Si el número es impar, se agrega al ArrayList de números impares       
                arrImpares.add(arr[i]);
                System.out.println("Es impar: "+arr[i]);
            }
        }
    }

    // Métodos para obtener los ArrayList de números pares e impares
    static ArrayList<Integer> getArrPares() {
        return arrPares;
    }

    static ArrayList<Integer> getArrImpares() {
        return arrImpares;
    }

    public static void main(String[] args) {
        int[] arr = setArreglo();
        getNums(arr);
        System.out.println("================");
        System.out.println("ARRAYS ALMACENADOS:");
        System.out.println("================");
        System.out.println("Numeros Pares");
        System.out.println(getArrPares());
        System.out.println("================");
        System.out.println("Numeros Impares");
        System.out.println(getArrImpares());
    }
}