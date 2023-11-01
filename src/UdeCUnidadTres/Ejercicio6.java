package UdeCUnidadTres;
/*
Crear un programa que permite calcular un número al azar de 1 a 50.
 */

public class Ejercicio6 {
    static int numeroAlAzar(){
        return (int) (Math.random() * 50) + 1;
    }
    public static void main(String[] args) {
        System.out.println(numeroAlAzar());
    }
}
