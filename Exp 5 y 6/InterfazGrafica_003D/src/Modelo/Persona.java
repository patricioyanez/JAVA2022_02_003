
package Modelo;

public class Persona {
    private String rut;
    private String nombre;
    private String apellido;
    private String direccion;

    public Persona() {
        this.rut = "";
        this.nombre = "";
        this.direccion = "";
        this.apellido = "";
    }
    public Persona(String rut, String nombre, String apellido, String direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void limpiar()
    {
        this.rut = "";
        this.nombre = "";
        this.direccion = "";
        this.telefono = ""; 
    }

    public String obtenerDatos() {
        return "Persona{" + "rut=" + rut + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
    
}
