package UdeCUnidadUno.Complementarios;
/*
Realiza un Algoritmos que Convierta de Décadas (10 años) a Días.
*/
import java.util.Scanner;

public class EjercicioC4 {
    static Scanner sc = new Scanner(System.in);
    static int decadas;
    static int diasxaño = 365;

    public static int decadasDias() {
        System.out.println("Ingrese Decadas: Ej 10, 20, 30");
        decadas = sc.nextInt();
        return decadas * diasxaño;
    }

    public static void main(String[] args) {
        System.out.println(decadasDias());
    }
}
