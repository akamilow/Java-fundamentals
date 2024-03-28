package UDECSEM1.UdeCUnidadTres;

/*
Desarrollar un programa que por medio de una función calcule la potencia de un número ingresado por parámetro.
 */
public class Ejercicio2 {

    static Integer calPotencia(int base, int exponente) {
        int resultado = 1;
        if (base > 0 && exponente == 0) {
            return resultado;
        } else if (base == 0 && exponente >= 1) {
            return 0;
        } else {
            for (int i = 1; i <= exponente; i++) {
                resultado = resultado * base;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(calPotencia(2, 3));
    }
}
