package UDECSEM1.UdeCUnidadTres;
/*
Desarrollar una función recursiva que calcule el factorial de un número
*/
public class Ejercicio15 {
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
