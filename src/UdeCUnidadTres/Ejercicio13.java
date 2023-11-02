package UdeCUnidadTres;

import java.util.Random;

/*
Crear un programa que permite calcular un número al azar de 1 a 50.
 */
public class Ejercicio13 {
    public static int generarNumeroAlAzar() {
        Random random = new Random();
        return generarNumeroAlAzarRecursivo(random);
    }

    public static int generarNumeroAlAzarRecursivo(Random random) {
        int numero = random.nextInt(50) + 1;

        if (numero >= 1 && numero <= 50) {
            return numero;
        } else {
            return generarNumeroAlAzarRecursivo(random);
        }
    }
    public static void main(String[] args) {
        int numero = generarNumeroAlAzar();
        System.out.println("Número al azar: " + numero);
    }
}
