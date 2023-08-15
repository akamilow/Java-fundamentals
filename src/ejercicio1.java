import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Atleta atleta = new Atleta();
        atleta.setNumeros();
        atleta.setNombres();
        atleta.setNacionalidades();
        atleta.setTiempos();

        System.out.println("----------------");
        System.out.println("PROMEDIO DE TIEMPOS");
        System.out.println("----------------");
        atleta.promedioTiempos();
        System.out.println("----------------");
        System.out.println("DATOS DE LA COMPETECNIA");
        System.out.println("----------------");
        atleta.getDatosCompetencia();
    }
}

class Atleta {
    public Integer numeroAtletas;

    public String[] arrayNombres;
    public String[] nacionalidades;

    public Double[] arrayTiempos;
    public Double[] tiempoAtletas;

    public double promedio;
    
    Scanner sc = new Scanner(System.in);

    public void setNumeros() {
        System.out.println("----------------");
        System.out.print("Ingrese el numero de atletas: ");
        numeroAtletas = sc.nextInt() + 1;
    }

    public void setNombres() {
        arrayNombres = new String[numeroAtletas];

        System.out.println("----------------");
        System.out.println("Ingrese los nombres: ");
        for(int i=0; i < this.arrayNombres.length; i++) {  
            arrayNombres[i] = sc.nextLine();
        }
    }

    public void setNacionalidades() {
        nacionalidades = new String[numeroAtletas -1];
        System.out.println("----------------");
        System.out.println("Ingrese los paises en orden, y por atleta: ");  
        for(int i=0; i < this.nacionalidades.length; i++) {  
            nacionalidades[i] = sc.nextLine();
        }  
    }

    public void setTiempos() {
        tiempoAtletas = new Double[numeroAtletas -1];
        System.out.println("----------------");
        System.out.println("Ingrese los tiempos, en orden: ");  
        for(int i=0; i < tiempoAtletas.length; i++) {
            System.out.println("----------------"); 
            tiempoAtletas[i] = sc.nextDouble();
        }
    }

    public void promedioTiempos() {
        Double suma = 0.0;
        for(int i=0; i < tiempoAtletas.length; i++) {  
            suma += tiempoAtletas[i];
        }
        promedio = suma / tiempoAtletas.length;

        System.out.println(Math.round(promedio*100.0)/100.0);
    }
    
    public void getDatosCompetencia() {
        String[] datos = new String[numeroAtletas -1];
        Double menor;
        menor = tiempoAtletas[0];

        for (int i=0; i < datos.length; i++) {  
            System.out.println(arrayNombres[i+1] +" - "+ nacionalidades[i] +" - "+ tiempoAtletas[i]);
        }

        for (int i = 0; i < tiempoAtletas.length; i++) {
            if(tiempoAtletas[i] < menor) {
                menor = tiempoAtletas[i];
            }
        }

        for (int i = 0; i < tiempoAtletas.length; i++) {
            if(tiempoAtletas[i] == menor) {
                System.out.println("EL GANADOR ES EL ATLETA: " + arrayNombres[i+1] + " CON TIEMPO: " + menor);
            }
        }
    }
}