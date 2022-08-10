package RETOSC2.RETO5.ConexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionSQL {
    public static Connection conexion;
    
    public static Connection conexion() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/reto5", "root", "root");
            JOptionPane.showMessageDialog(null, "Conexión Establecida");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sin Conexión "+ e.getMessage());
        }
        return conexion;
    }
}
