package UDECSEM1.UdeCUnidadCuatro;
/*
5. Desarrollar un algoritmo que permita buscar en un arreglo un número ingresado por teclado e 
imprima el número y la posición en que fue encontrado
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Se crea un objeto Scanner para la entrada de datos
        int[] arreglo = new int[]{1,2,3,4,5,6,7,8,9,10};// Se inicializa un arreglo con valores del 1 al 10
        System.out.println("Digite un numero del 1 al 10, y encuentre su indice");// Se solicita al usuario que ingrese un número
        int numBuscado = sc.nextInt();//Se lee el numero ingresado por el usuario
        sc.close();//Se cierra el Scanner para liberar recursos

        boolean encontrado = false;// Variable para verificar si se encuentra el número en el arreglo

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numBuscado) {// Si se encuentra el número en el arreglo
                encontrado = true;// Se marca como encontrado
                System.out.println("El numero " + numBuscado + " fue encontrado en la posicion " + i);// Se muestra la posición donde se encontró
                break;// Se sale del bucle una vez que se ha encontrado el número
            }
        }
        
        if (!encontrado) {// Si el número no fue encontrado en el arreglo
            System.out.println("El numero " + numBuscado + " no fue encontrado en el arreglo");// Se muestra un mensaje indicando que no se encontró
        }
    }
}
