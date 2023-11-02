package UdeCUnidadTres;
/*
Crear un programa con un menú 
(1. Sumar, 
2. Restar, 
3. Multiplicar, 
4. Dividir,
5. Salir), y según la opción que selecciones el usuario del sistema
pida dos números, los mande en una función y retorne el valor.
*/
import java.util.Scanner;

public class Ejercicio11 {
    static int sumar(int a, int b){
        return a + b;
    }

    static int restar(int a, int b){
        return a - b;
    }

    static int multiplicar(int a, int b){
        return a * b;
    }

    static int dividir(int a, int b){
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int a = 0;
        int b = 0;
        do {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            if (opcion != 5) {
                System.out.print("Ingrese el primer número: ");
                a = sc.nextInt();
                System.out.print("Ingrese el segundo número: ");
                b = sc.nextInt();
            }
            sc.close();
            switch (opcion) {
                case 1:
                    System.out.println("La suma de " + a + " y " + b + " es: " + sumar(a, b));
                    break;
                case 2:
                    System.out.println("La resta de " + a + " y " + b + " es: " + restar(a, b));
                    break;
                case 3:
                    System.out.println("La multiplicación de " + a + " y " + b + " es: " + multiplicar(a, b));
                    break;
                case 4:
                    System.out.println("La división de " + a + " y " + b + " es: " + dividir(a, b));
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                }
        }   while (opcion != 5);
    }
}