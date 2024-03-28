/*
Un programa que exprese en horas, minutos y segundos un tiempo expresado en segundos.
 */
package UDECSEM1.UdeCUnidadUno;
import java.util.Scanner;

public class Ejercicio14 {
    static Scanner sc = new Scanner(System.in);
    static int segundos;
    static float minutos;
    static float horas;

    public static float divMin() {
        return minutos = segundos / 60;  
    }
    
    public static float divHrs() {
        return horas = minutos / 60;
    }

    public static void main(String[] args) {
        System.out.println("Ingresar tiempo expresado en segundos: ");
        segundos = sc.nextInt();
        System.out.println("=================");
        System.out.println("Timepo en segundos: " + segundos + "seg");
        System.out.println("=================");
        System.out.println("Timepo en minutos: " + divMin() + "min");
        System.out.println("=================");
        System.out.println("Timepo en horas: " + divHrs() + "h");
    }
}
