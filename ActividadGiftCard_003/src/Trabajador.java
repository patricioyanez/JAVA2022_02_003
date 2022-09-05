
public class Trabajador {
    private int rut;
    private String dv;
    private String nombre;

    public Trabajador() {
        this.rut = 0;
        this.dv = "";
        this.nombre = "";
    }
    
    public Trabajador(int rut, String dv, String nombre) {
        this.rut = rut;
        this.dv = dv;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "rut=" + rut + ", dv=" + dv + ", nombre=" + nombre + '}';
    }
    
    
}
