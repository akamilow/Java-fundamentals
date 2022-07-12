package RETOSC2.RETO2;
public abstract class Juguete {
    String nombre;
    String numeroPiezas;
    String edadPermitida;

    public Juguete(String nombre, String numeroPiezas, String edadPermitida) {
        this.nombre = nombre;
        this.numeroPiezas = numeroPiezas;
        this.edadPermitida = edadPermitida;
    }
}