package UdeCUnidadCuatro;

import java.util.ArrayList;

/*
Desarrollar un programa que almacena en un arreglo los números pares y
en otro los números impares comprendidos entre 1 y 100 e imprima esos
*/

public class Ejercicio3 {
    static ArrayList<Integer> arrPares = new ArrayList<Integer>();
    static ArrayList<Integer> arrImpares = new ArrayList<Integer>();

    static int[] setArreglo() {
        int[] arreglo = new int[101];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i;
        }
        return arreglo;
    }

    static void getNums(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arrPares.add(arr[i]);
                System.out.println("Es par: "+arr[i]);
            } else if (!(arr[i] % 2 == 0)) {        
                arrImpares.add(arr[i]);
                System.out.println("Es impar: "+arr[i]);
            }
        }
    }

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