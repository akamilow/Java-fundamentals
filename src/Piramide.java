/*
In java make a program that takes a number 'n' and prints an inverted pyramid of 'n' lines.
*/
import java.util.Scanner;
public class Piramide {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese numero: ");
        // int n = sc.nextInt();
        int n = 6;
        for (int i = 0; i <= n; i++) {
            System.out.println("");
            for (int j = n; j >= i; j--) {
                System.out.print("*");          
            }
        }
    }
}