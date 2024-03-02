package RETOSC2.RETO2;

public class Imaginario extends Juguete{
    String poderes;

    public Imaginario(String nombre, String numeroPiezas, String edadPermitida, String poderes) {
        super(nombre, numeroPiezas, edadPermitida);
        this.poderes = poderes;
    }

    @Override
    public String toString() {
        return "\tJuguete Imagianrio - Nombre: " + nombre + "\n" +
        "\tpiezas: " + numeroPiezas + "\n" +
        "\tedad: " + edadPermitida + "\n" +
        "\tcolor: " + poderes;
    }
}
