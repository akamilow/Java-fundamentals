package UdeCUnidadUno.Complementarios;

/*
Desea Calcular el Perímetro de polígono Regular de 6 lados.
Formula:
    P = 6 * lado
*/
import java.util.Scanner;

public class EjercicioC1 {
    static Scanner sc = new Scanner(System.in);
    static int lado, perimetro;
    
    public static void calcularPerimetro() {
        System.out.println("Ingrese longitud de un lado");
        lado = sc.nextInt();
        perimetro = 6 * lado;
        System.out.println("Es perimetor del poligono es: " + perimetro);
        sc.close();
    }

    public static void main(String[] args) {
        calcularPerimetro();
    }
    
}