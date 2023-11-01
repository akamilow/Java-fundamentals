package UdeCUnidadTres;
/*
Desarrollar un programa que por medio de una función calcule la potencia de un número ingresado por parámetro.
 */
public class Ejercicio2 {
    
    static Integer calPotencia(int base, int exponente) {
        return (int) Math.pow(base, exponente);
    }
    public static void main(String[] args) {
        System.out.println(calPotencia(2, 3));
    }
}
