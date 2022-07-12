package RETOSC2.RETO2;
public class Mecanico extends Juguete {
    String color;

    public Mecanico(String nombre, String numeroPiezas, String edadPermitida, String color) {
        super(nombre, numeroPiezas, edadPermitida);
        this.color = color;
    }

    @Override
    public String toString() {
        return "\tJuguete Mecanico - Nombre:" + nombre + "\n" +
                "\tpiezas:" + numeroPiezas + "\n" +
                "\tedad:" + edadPermitida + "\n" +
                "\tcolor:" + color;
    }
}