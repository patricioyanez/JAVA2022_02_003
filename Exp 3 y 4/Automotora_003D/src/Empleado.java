/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patri
 */
public class Empleado {
    private String rut;
    private String nombre;
    private String genero;
    private int aniosServicios;
    private int edad;
    private Puesto puesto;

    public Empleado() {
        this.rut = "";
        this.nombre = "";
        this.genero = "";
        this.aniosServicios = 0;
        this.edad = 1;
        this.puesto = new Puesto();
    }
    public Empleado(String rut, String nombre, String genero, int aniosServicios, int edad, Puesto puesto) {
        this.rut = rut;
        this.nombre = nombre;
        this.genero = genero;
        this.aniosServicios = aniosServicios;
        this.edad = edad;
        this.puesto = puesto;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAniosServicios() {
        return aniosServicios;
    }

    public void setAniosServicios(int aniosServicios) {
        this.aniosServicios = aniosServicios;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String datos() {
        return "Empleado:" + 
                "\nrut              =" + rut + 
                "\nnombre           =" + nombre + 
                "\ngenero           =" + genero + 
                "\naños de Servicio =" + aniosServicios + 
                "\nedad             =" + edad  + 
                "\n" + puesto.datos();
    }
    
    
}
