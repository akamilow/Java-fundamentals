package UDECSEM1.UdeCUnidadTres;
/*
Crear un programa con un menú 
(1. Sumar, 
2. Restar, 
3. Multiplicar, 
4. Dividir,
5. Salir).
Según la opción que selecciones el usuario del sistema
 */
import java.util.Scanner;

public class Ejercicio4 {

    static int sumar(int num1, int num2){
        return num1 + num2;
    }

    static int restar(int num1, int num2){
        return num1 - num2;
    }

    static int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    static int dividir(int num1, int num2){
        return num1 / num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Opciones del menú");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");

        boolean op = true;
        while (op) {
            System.out.println("Ingrese numero 1");
            int num1 = sc.nextInt();
            System.out.println("Ingrese numero 2");
            int num2 = sc.nextInt();
            System.out.println("===========================");
            System.out.println("Seleccione una opción (Numero)");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + restar(num1, num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("La división es: " + dividir(num1, num2));
                    break;
                case 5:
                    op = false;
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                    break;
            }
        }
        sc.close();
    }
}
