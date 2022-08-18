
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
        
    }  
    
}
