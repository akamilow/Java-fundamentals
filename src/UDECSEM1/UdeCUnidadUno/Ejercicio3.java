/*
Un estudiante de Ingeniería de Sistemas de la UdeC tiene tres cortes de notas en una asignatura con valor de 0.0 a 5.0, 
el primer y segundo corte vale un 20% y el tercer corte vale 60%.
Desarrollar una solución algorítmica que permita saber que nota se debe sacar como mínimo en el 60% si conozco los primeros 20%. 
Tener en cuenta que para superar una asignatura debe ser igual o mayor a 3.0.
*/
/*
 * Formula para alcazar nota minima en tercer corte:
Nota necesaria en el tercer corte = ((Nota deseada - (Nota del primer corte x Porcentaje del primer corte) - (Nota del segundo corte x Porcentaje del segundo corte)) / Porcentaje del tercer corte
 */
package UDECSEM1.UdeCUnidadUno;
import java.util.Scanner;

public class Ejercicio3 {
    static Scanner sc = new Scanner(System.in);
    static double nota1;
    static double nota2;
    static double nota3;

    public static double calcularNota3() {
        return nota3 = ((3.0 - (nota1 * 0.20) - (nota2 * 0.20)) / 0.60);
    }

    public static void main(String[] args) {
        System.out.println("Ingrese Nota 1");
        nota1 = sc.nextDouble();
        System.out.println("===============");
        System.out.println("Ingrese Nota 2");
        nota2 = sc.nextDouble();
        System.out.println("===============");
        System.out.println("NOTA REQUERIDA PARA TERCER CORTE: " + calcularNota3());
    }

}
