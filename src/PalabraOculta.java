import java.util.Scanner;

public class PalabraOculta {
    static String palabraOculta = "camilo";
    static String[] palabra = {"_", "_", "_", "_", "_", "_"};
    static int intentos = palabraOculta.length(); //tamaño 6

    static int verificarExistencia(String letra) {
        int contadorLetras = 0;
        for (String dato : palabra) {
            if (dato.equals(letra)) {
                contadorLetras++;
            }
        }
        return contadorLetras;
    }

    static int contarEspacios() {
        int contador = 0;
        for (String dato : palabra) {
            if (dato.equals("_")) {
                contador++;
            }
        }
        return contador;
    }

    static boolean existe(String letra) {
        if (palabraOculta.contains(letra)) {
            if (verificarExistencia(letra) > 0) {
                System.out.println("La letra ya fue ingresada, intenta con otra");
            } else {
                agregarLetra(letra);
            }
            return true;
        } else {
            intentos--;
            System.out.println("te quedan " + intentos + " intentos");
            return false;
        }
    }

    static void agregarLetra(String letra) {
        for (int i = 0; i < palabraOculta.length(); i++) {
            if (palabraOculta.charAt(i) == letra.charAt(0)) {
                palabra[i] = letra;
                imprimirPalabra();
            }
        }
    }

    static void imprimirPalabra() {
        for (int i = 0; i < palabra.length; i++) {
            System.out.print(palabra[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String letra;

        do {
            System.out.println("Ingrese una letra a adivinar");
            letra = entrada.next();

            if (existe(letra) == true) {
                System.out.println("la letra " + letra + " existe en la palabra oculta");
            } else {
                System.out.println("la letra " + letra + " NO existe en la palabra oculta");
            }

            if (contarEspacios() == 0) {
                System.out.println("Ganaste!");
                break;
            }

        } while (intentos > 0);
        System.out.println("Fin del juego");
    }
}
