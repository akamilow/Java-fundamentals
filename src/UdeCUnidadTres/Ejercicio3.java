package UdeCUnidadTres;
/*
Desarrollar un programa que por medio de una función de retorno 
calcule la factorial de un número ingresado por parámetro.
 */
public class Ejercicio3 {
    static int factorial(int num){
        if (num == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
