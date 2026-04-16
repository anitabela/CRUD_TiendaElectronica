package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/tienda_electronica";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    public static Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectado correctamente");
            return con;
        } catch (Exception e) {
            System.out.println("Error de conexión: " + e.getMessage());
            return null;
        }
    }
}