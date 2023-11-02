package UdeCUnidadTres;
/*
Desarrollar un programa que por medio de una función de retorno calcule la factorial de un número ingresado por parámetro.
*/
public class Ejercicio10 {
    static int factorial(int n){
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("El factorial de " + n + " es: " + factorial(n));
    }
}
