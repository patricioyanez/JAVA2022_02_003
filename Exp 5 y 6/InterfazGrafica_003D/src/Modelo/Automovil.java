
package Modelo;


public class Automovil {
    private String patente;
    private Double cilindrada;
    private int puertas;
    private String marca;
    private String modelo;
    private boolean encendidoElectronico;

    public Automovil() {
        this.patente = "";
        this.cilindrada = 0D;
        this.puertas = 0;
        this.marca = "";
        this.modelo = "";
        this.encendidoElectronico = false;
    }
    public Automovil(String patente, Double cilindrada, int puertas, String marca, String modelo, boolean encendidoElectronico) {
        this.patente = patente;
        this.cilindrada = cilindrada;
        this.puertas = puertas;
        this.marca = marca;
        this.modelo = modelo;
        this.encendidoElectronico = encendidoElectronico;
    }

    public boolean isEncendidoElectronico() {
        return encendidoElectronico;
    }

    public void setEncendidoElectronico(boolean encendidoElectronico) {
        this.encendidoElectronico = encendidoElectronico;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void limpiar()
    {
        this.patente = "";
        this.cilindrada = 0D;
        this.puertas = 0;
        this.marca = "";
        this.modelo = "";
        this.encendidoElectronico = false;
    }

    public String obtenerDatos() {
        return "Automovil{" + "patente=" + patente + ", cilindrada=" + cilindrada + ", puertas=" + puertas + ", marca=" + marca + ", modelo=" + modelo + ", encendidoElectronico=" + encendidoElectronico + '}';
    }
        
}
