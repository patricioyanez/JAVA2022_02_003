
public class Principal {
    
    public static void main(String[] args)
    {
        System.out.println("Hola Mundo!!!");
        // creación de objeto de tipo Pizza
        Pizza pizza1; // definir variable de objeto
        pizza1 = new Pizza(); // crear y asignar objeto
        
        Pizza pizza2 = new Pizza();
        
        pizza1.preparar();
        pizza1.calentar();
        pizza2.preparar();
        pizza2.calentar();
        
        Pizza pizza3 = new Pizza("napolitana","familiar", "Gruesa");
        pizza1.setNombre("Taxana"); // modifica el valor del atributo
        pizza1.setTamano("Personal");
        pizza1.setNombre("Texas con BBQ");
        pizza1.datos();
        pizza2.datos();
        pizza3.datos();
    }  
    
}
