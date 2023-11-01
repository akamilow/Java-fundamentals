package UdeCUnidadUno.Complementarios;
/*
Digitar un Numero Entero Positivo y dividirlo en 5 dígitos, 
EL Primer y Último Digito Se eleva al Cuadrado.
*/
import java.util.Scanner;
import java.util.ArrayList;

public class EjercicioC3 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> arrayInt = new ArrayList<>();
    static int entero;
    static int enteroDividido;

    public static void divInt5() {
        System.out.println("Ingrese entero");
        entero = sc.nextInt();
        enteroDividido = entero / 5;

        for (int i = 0; i < 5; i++) {
            arrayInt.add(enteroDividido); 
        }

        arrayInt.set(0, (int) Math.pow(enteroDividido, 2));
        arrayInt.set(4, (int) Math.pow(enteroDividido, 2));
        
        System.out.println(arrayInt);
    }

    public static void main(String[] args) {
        divInt5();
    }    

}
