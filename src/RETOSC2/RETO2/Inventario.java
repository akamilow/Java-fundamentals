package RETOSC2.RETO2;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    Scanner sc = new Scanner(System.in);
    public static ArrayList<Juguete> jueguetes = new ArrayList<Juguete>();

    public Inventario() {
        Inventario.jueguetes = new ArrayList<Juguete>();
    }
    
    public void agregarJuguete(String entrada){
        String[] partes = entrada.toString().split("/");

        if (partes[1].compareTo("Electronico") == 0) {
            jueguetes.add(new Electronico(partes[2], partes[3], partes[4], partes[5], partes[6]));
        } else if (partes[1].compareTo("Mecanico") == 0) {
            jueguetes.add(new Mecanico(partes[2], partes[3], partes[4], partes[5]));
        }
    }
    
    public void listarJuguetes() {
        System.out.println("***Inventario de Juguetes***");

        for(int i = 0; i < jueguetes.size(); i++) {
            System.out.println(jueguetes.get(i).toString());
        }
    }
    
    public void procesarComandos() {
        String entrada = "";

        while(!entrada.startsWith("3")) {
            entrada = sc.nextLine();
            char opcion = entrada.charAt(0);
            
            switch (opcion) {
                case '1':
                    agregarJuguete(entrada);
                    break;
                case '2':
                    listarJuguetes();
                    break;
                case '3':
                    System.exit(0);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Inventario inv = new Inventario();
        inv.procesarComandos();
    }
}