package UDECSEM1.UdeCUnidadTres;
/*
Desarrollar una función recursiva que reciba por parámetro un número y regrese la conversión en binario del número.
*/
public class Ejercicio16 {
    static String binario(int n){
        if (n < 2) {
            return Integer.toString(n);
        } else {
            return binario(n / 2) + Integer.toString(n % 2);
        }
    }
    public static void main(String[] args) {
        System.out.println(binario(10));
    }
}
