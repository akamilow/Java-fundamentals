package UdeCUnidadTres;
/*
Desarrollar un programa que por medio de una función imprima un mensaje cinco veces.
 */

public class Ejercicio8 {
    static void imprimirMensaje(int numMensaje){
        if (numMensaje > 0) {
            System.out.println("Hola mundo");
            imprimirMensaje(numMensaje - 1);
        }
    }
    public static void main(String[] args) {
        imprimirMensaje(5);
    }
}
