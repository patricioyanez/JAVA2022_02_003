package Controlador;
import Conexion.Conexion;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CPersona {
    private Conexion conexion = new Conexion();
   
    public boolean agregar(Persona persona)
    {
        try {
            Connection cnx = conexion.obtenerConexion();
            String sql = "INSERT INTO PERSONA (RUT, NOMBRE, APELLIDO, DIRECCION) VALUE (?,?,?,?)";
            
            PreparedStatement stmt = cnx.prepareStatement(sql);
            stmt.setString(1, persona.getRut());
            stmt.setString(2, persona.getNombre());
            stmt.setString(3, persona.getApellido());
            stmt.setString(4, persona.getDireccion());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(CPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public Persona buscarPorRut(String rut)
    {
        try {
            Connection cnx = conexion.obtenerConexion();
            String sql = "SELECT * FROM PERSONA WHERE RUT = ?";
            PreparedStatement ps = cnx.prepareStatement(sql);
            ps.setString(1, rut);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                Persona persona = new Persona();
                persona.setRut(rs.getString("RUT"));
                persona.setNombre(rs.getString("NOMBRE"));
                persona.setApellido(rs.getString("APELLIDO"));
                persona.setDireccion(rs.getString("DIRECCION"));
                return persona;
            }
            else
                return null;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean modificar(Persona persona)
    {
        try {
            Connection cnx = conexion.obtenerConexion();
            String sql = "UPDATE PERSONA SET NOMBRE = ?, APELLIDO = ?, DIRECCION = ? WHERE RUT = ?";
            
            PreparedStatement stmt = cnx.prepareStatement(sql);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getDireccion());
            stmt.setString(4, persona.getRut());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(CPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean eliminar(String rut)
    {
        try {
            
            Connection cnx = conexion.obtenerConexion();
            String sql = "DELETE FROM PERSONA WHERE RUT = ?";
            PreparedStatement stmt = cnx.prepareStatement(sql);
            stmt.setString(1, rut);
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
