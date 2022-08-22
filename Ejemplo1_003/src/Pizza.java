
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
    // 4.- Métodos Customer o personalizado
    public void preparar()
    {
        System.out.println("La pizza se está preparando...");
    }
    public void calentar()
    {
        System.out.println("La pizza se está calentando...");
    }    
}
