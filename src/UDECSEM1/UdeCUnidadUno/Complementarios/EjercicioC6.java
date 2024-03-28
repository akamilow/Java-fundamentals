package UDECSEM1.UdeCUnidadUno.Complementarios;
/*
Calcular el número de pulsaciones que una persona debe tener por cada 10 segundos de ejercicio, si la fórmula es:
num. pulsaciones = (220 - edad) / 10
*/
import java.util.Scanner;

public class EjercicioC6 {
    static Scanner sc = new Scanner(System.in);
    static int edad, num_pulsaciones;

    public static void numPulsaciones() {
        System.out.println("Ingrese su edad:");
        edad = sc.nextInt();
        num_pulsaciones = (220 - edad) / 10;
        System.out.println("El número de pulsaciones que debe tener por cada 10 segundos es: " + num_pulsaciones);
    }

    public static void main(String[] args) {
        numPulsaciones();
    }
}
