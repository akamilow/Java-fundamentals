package UdeCUnidadCuatro;

/*
4. Desarrollar algoritmo que sume dos arreglos de 10 posiciones.
 */
public class Ejercicio4 {

    // Método para inicializar y llenar el primer arreglo con valores del 0 al 10
    static int[] setArregloUno() {
        int[] arregloUno = new int[11];
        for (int i = 0; i < arregloUno.length; i++) {
            arregloUno[i] = i;
        }
        return arregloUno;
    }

    // Método para inicializar y llenar el segundo arreglo con valores del 0 al 10
    static int[] setArregloDos() {
        int[] arregloDos = new int[11];
        for (int i = 0; i < arregloDos.length; i++) {
            arregloDos[i] = i;
        }
        return arregloDos;
    }

    // Método para sumar los elementos de dos arreglos y devolver la suma total
    static int sumArreglos(int[] arr1, int[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            count += arr1[i];// Se suma el valor del elemento en la posición 'i' del primer arreglo
            count += arr2[i];// Se suma el valor del elemento en la posición 'i' del segundo arreglo

        }
        return count;// Retorna la suma total de ambos arreglos
    }
    public static void main(String[] args) {
        int[] arr1 = setArregloUno();// Se inicializa el primer arreglo
        int[] arr2 = setArregloDos();// Se inicializa el segundo arreglo
        System.out.println(sumArreglos(arr1, arr2));// Se muestra en consola la suma total de ambos arreglos
    }
}
