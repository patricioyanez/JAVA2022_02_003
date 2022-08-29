import java.util.Scanner;


public class Sentencias2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Indique su voto:");
        System.out.println("1.- Apruebo");
        System.out.println("2.- Rechazo");
        System.out.println("3.- Nulo o Blanco");
        System.out.print("Ingrese su opcion:");
        opcion = leer.nextInt();
        
        if(opcion < 1 || opcion > 3)
        {
            System.out.println("Opción no es válido");
        }
        else
        {
            if(opcion == 1)
            {
                System.out.println("Ud votó apruebo");
            }
            else if(opcion == 2)
            {
                System.out.println("Ud. votó rechazo");
            }
            else if(opcion == 3)
            {
                System.out.println("Ud. votó nulo o blanco");
            }
            String nombre;
            System.out.print("Escriba su nombre:");
            nombre = leer.next();
            System.out.println("Gracias " + nombre + " por votar.");
            
        }
    }
    
}
