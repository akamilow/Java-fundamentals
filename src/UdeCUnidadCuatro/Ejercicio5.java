package UdeCUnidadCuatro;
/*
5. Desarrollar un algoritmo que permita buscar en un arreglo un número ingresado por teclado e 
imprima el número y la posición en que fue encontrado
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("Digite un numero del 1 al 10, y encuentre su indice");
        int numBuscado = sc.nextInt();
        sc.close();

        int indice = -1;
        
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numBuscado) {
                indice = i;
                break;
            }
        }
        
        if (indice != -1) {
            System.out.println("El numero " + numBuscado + " fue encontrado en la posicion " + indice);
        } else {
            System.out.println("El numero " + numBuscado + " no fue encontrado en el arreglo");
        }
    }
}
