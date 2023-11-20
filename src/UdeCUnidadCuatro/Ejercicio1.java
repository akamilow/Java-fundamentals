package UdeCUnidadCuatro;
/**
1. Desarrollar un algoritmo que permita almacenar en un arreglo los números
del 1 al 50 e imprima en pantalla lo que registro.
*/

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] arreglo = new int[51];

    
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i;
        }

        for (int i = 1; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
        }
    }
}
