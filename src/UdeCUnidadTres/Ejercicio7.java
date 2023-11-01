package UdeCUnidadTres;
/*
Desarrollar un algoritmo que permita calcular si un numero ingresa por teclado es perfecto o no. 
(Consultar el concepto de número perfecto).
 */
import java.util.Scanner;
public class Ejercicio7 {

    static void numPerfecto(int num){
        int sumaDivisores = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumaDivisores += i;
            }
        }
        
        if (sumaDivisores == num) {
            System.out.println("El número " + num + " es perfecto.");
        } else {
            System.out.println("El número " + num + " no es perfecto."); 
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = sc.nextInt();
        sc.close();
        numPerfecto(num);
    }
}
