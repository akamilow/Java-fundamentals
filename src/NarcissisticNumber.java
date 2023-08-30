/*
Reto 28/06/2022  

Un numero narcisista es el cual la suma de sus propios dígitos elevados a 
la cantidad de cifras es el valor del mismo.

Por ejemplo:
El numero 153 (3 dígitos), es narcisista porque:
1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

El numero 1652 (4 digitos), no narcisista porque:
1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938

Tu misión será hacer una función con el nombre "narcissistic" la cual retorne un true si el numero es narcisista o 
un false sino y esta recibe un parámetro que es el numero a examinar.
*/

import java.util.Scanner;

public class NarcissisticNumber {
    static int number;
    static String[] arrayNumberStr;
    
    static Scanner sc = new Scanner(System.in);

    public static int Number() {
        System.out.println("Ingrese un numero:");
        return number = sc.nextInt();
    }

    public static String[] arrayNumberStr() {
        arrayNumberStr = String.valueOf(number).split("");
        return arrayNumberStr;
    }

    public static void getArrayStr() {
        for (int i= 0; i < arrayNumberStr.length; i++) {
            System.out.println(arrayNumberStr[i]);
        }
    }

    public static void main(String[] args) {
        Number();
        System.out.println("----------");
        arrayNumberStr();
        getArrayStr();
        
    }
    
}

// No terminado



    // public static double CalculatePower() {
    //     return Math.pow(num,pow);
    // }