package Controlador;
import Conexion.Conexion;
import Modelo.Persona;
import java.sql.Connection;

public class CPersona {
    private Conexion conexion = new Conexion();
   
    public boolean agregar(Persona persona)
    {
        Connection cnx = conexion.obtenerConexion();
        String sql = "INSERT INTO PERSONA (RUT, NOMBRE, APELLIDO, DIRECCION) VALUE (?,?,?,?)";
    }
}
