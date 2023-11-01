package UdeCUnidadUno.Complementarios;
/*
La presión, el volumen y la temperatura de una masa de aire se relacionan por la formula:
masa = (presión * volumen) /(0.37 * (temperatura + 460))
*/
import java.util.Scanner;

public class EjercicioC5 {
    static Scanner sc = new Scanner(System.in);
    static int presion, volumen, temperatura, masa;

    public static void masaAire() {
        System.out.println("Ingrese presión");
        presion = sc.nextInt();
        System.out.println("Ingrese volumen");
        volumen = sc.nextInt();
        System.out.println("Ingrese temperatura");
        temperatura = sc.nextInt();
        System.out.println("============");
        masa = (int) ((presion * volumen) / (0.37 * (temperatura + 460)));
        System.out.println("La masa de aire es: " + masa);

    }
    public static void main(String[] args) {
        masaAire();
    }
}
