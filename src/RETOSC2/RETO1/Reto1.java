package RETOSC2.RETO1;

/*
Conforme la nueva reforma tributaria se establecieron los nuevos precios de la
canasta familiar colombiana; la leche, los huevos y el café son los primeros productos
afectados por esta reforma. 

Al preguntarle al tendero el precio de los huevos y la leche me responde que
si le quito 4 pesos al precio de la leche obtengo dos veces el precio de los huevos y si sumo el precio de la leche y
los huevos me da cinco veces el precio del café. Adicionalmente, todos los productos fueron gravados con
diferentes porcentajes basados en las siguientes categorías:

·   Categoría uno: para productos que valgan entre 0 y 20 pesos

·   Categoría dos: para productos entre 21 y 30 pesos

·   Categoría tres: para productos entre 31 y 50 pesos

·   Categoría cuatro: para productos que valgan más de 50 pesos.

Dado el precio de los huevos, realizar un
programa que imprima en la primera línea los precios de los huevos,
la leche y el café separados por un solo espacio. En la segunda línea
indique con qué categoría fue grabado el café.

Nota: Los precios de los productos son números enteros.

73
73 150 44
tres

37
37 78 23
dos

56
56 116 34
tres
* */
import java.util.Scanner;

public class Reto1 {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese precio de los huevos:");
        int precioHuevos = sc.nextInt();
        int precioLeche = 2 * precioHuevos + 4;
        int precioCafe = (precioHuevos + precioLeche) / 5;

        System.out.println(precioHuevos + " " + precioLeche + " " + precioCafe);
        
        if (precioCafe >= 0 && precioCafe <= 20) {
            System.out.println("uno");
        } else if (precioCafe >= 21 && precioCafe <= 30) {
            System.out.println("dos");
        } else if (precioCafe >= 31 && precioCafe <= 50) {
            System.out.println("tres");
        } else if (precioCafe >= 50) {
            System.out.println("cuatro");
        }
    }
}