package RETOSC2.RETO2;
public class Electronico extends Juguete{
    String cantidadBaterias;
    String vidaUtil;

    public Electronico(String nombre, String numeroPiezas, String edadPermitida, String cantidadBaterias, String vidaUtil) {
        super(nombre, numeroPiezas, edadPermitida);
        this.cantidadBaterias = cantidadBaterias;
        this.vidaUtil = vidaUtil;
    }
    
    @Override
    public String toString() {
        return "\tJuguete Electronico - Nombre:" + nombre + "\n" +
                "\tpiezas:" + numeroPiezas + "\n" +
                "\tedad:" + edadPermitida + "\n" +
                "\tbaterias:" + cantidadBaterias + "\n" +
                "\tVida útil:" + vidaUtil;
    }
}
