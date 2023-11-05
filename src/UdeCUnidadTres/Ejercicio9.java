package UdeCUnidadTres;
/*
Desarrollar un programa que por medio de una función calcule la potencia de un número ingresado por parámetro.
 */
public class Ejercicio9 {
    static int potencia(int base, int exponente){
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(potencia(2, 3));
    }
}
