/*
Un programa que obtiene la última cifra de un número introducido.
*/
package UDECSEM1.UdeCUnidadUno;
import java.util.Scanner;

public class Ejercicio12 {
    static Scanner sc = new Scanner(System.in);
    static int num;
    static String[] numStrArray;
    static String ultimoNumStr;
    static int ultimoNumInt;

    static int ultimaCifra() {
        numStrArray = String.valueOf(num).split(""); // se trasfomar el int ej: 123 en string ej: "123" y lo convierte en array ej: [1, 2, 3]

        for (int i=0; i < numStrArray.length; i++) {
            ultimoNumStr = numStrArray[i]; // itero sobre el array y cada string del array se asigna a la variable "ultimoNumStr".
        }                                  // cuando terminen las iteraciones el ultimo string seria el valor de "ultimoNumStr".
        
        ultimoNumInt = Integer.parseInt(ultimoNumStr); // la ultima cifra pasa de ser string a int

        return ultimoNumInt;
    }
    public static void main(String[] args) {
        System.out.println("Ingresar numero:");
        num = sc.nextInt();
        System.out.println(ultimaCifra());
    }
}
