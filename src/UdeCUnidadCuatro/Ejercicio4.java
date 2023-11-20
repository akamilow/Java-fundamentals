package UdeCUnidadCuatro;

/*
4. Desarrollar algoritmo que sume dos arreglos de 10 posiciones.
 */
public class Ejercicio4 {

    static int[] setArregloUno() {
        int[] arregloUno = new int[11];
        for (int i = 0; i < arregloUno.length; i++) {
            arregloUno[i] = i;
        }
        return arregloUno;
    }

    static int[] setArregloDos() {
        int[] arregloDos = new int[11];
        for (int i = 0; i < arregloDos.length; i++) {
            arregloDos[i] = i;
        }
        return arregloDos;
    }

    static int sumArreglos(int[] arr1, int[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            count += arr1[i];
            count += arr2[i];
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = setArregloUno();
        int[] arr2 = setArregloDos();
        System.out.println(sumArreglos(arr1, arr2));
    }
}
