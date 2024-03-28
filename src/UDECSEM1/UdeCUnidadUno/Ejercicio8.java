/*
Un programa que lea el valor correspondiente a una distancia en millas marinas y las escribas expresadas en metros. 
Sabiendo que 1 milla marina equivale a 1852 metros.
*/
package UDECSEM1.UdeCUnidadUno;
import java.util.Scanner;

public class Ejercicio8 {
    static Scanner sc = new Scanner(System.in);
    static int metro = 1852;
    static int millas;
    
    public static int millasAMetros() {
        return millas * metro;
    }
    public static void main(String[] args) {
        System.out.println("Ingresar Millas Marinas:");
        millas = sc.nextInt();
        System.out.println("Conversion de millas marinas a metros: " + millasAMetros());

    }
}
