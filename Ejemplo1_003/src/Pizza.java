
public class Pizza {
    // 1.- Atributos
    private String nombre;
    private String tamano;
    private String masa;
    
    // 2.- Constructores
    public Pizza()
    {
        this.nombre = "";
        this.tamano = "";
        this.masa = "";
//        System.out.println("Constructor sin parametros");
    }
    public Pizza(String nombre, String tamano, String masa)
    {
        this.nombre = nombre;
        this.tamano = tamano;
        this.masa = masa;
//        System.out.println("Constructor con parametros");
    }
    // 3.-Getter y Setter
    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getTamano()
    {
        return this.tamano;
    }
    public void setTamano(String tamano)
    {
        this.tamano = tamano;
    }
    
    public String getMasa()
    {
        return this.masa;
    }
    public void setMasa(String masa)
    {
        this.masa = masa;
    }
    
    
    
    // 4.- Métodos Customer o personalizado
    public void preparar()
    {
        System.out.println("La pizza se está preparando...");
    }
    public void calentar()
    {
        System.out.println("La pizza se está calentando...");
    }
    
    public void datos()
    {
        System.out.println("*** Nombre de la Pizza ***");
        System.out.println("Nombre  : " + this.getNombre());
        System.out.println("Tamaño  : " + this.getTamano());
        System.out.println("Masa    : " + this.getMasa());
    }
}
