import java.util.Scanner;
public class Sentencias3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nivel = 0;
        System.out.println("Nivel Educacional");
        System.out.println("1.- Básica");
        System.out.println("2.- Media");
        System.out.println("3.- Superior");
        System.out.println("4.- Magister");
        System.out.println("5.- Doctor");
        System.out.println("6.- No tiene");
        System.out.println("Seleccione nivel:");
        nivel = leer.nextInt();
        
        switch(nivel)
        {
            case 1:
                System.out.println("Ud. tiene ed. básica");
                break;
            case 2:
                System.out.println("Ud. tiene ed. media");
                break;
            case 3:
                System.out.println("Ud. tiene ed. superior");
                break;
            case 4:
                System.out.println("Ud. tiene magister");
                break;                
            case 5:
                System.out.println("Ud. tiene un doctorado");
                break;
            case 6:
                System.out.println("Ud. no tiene");
                break;
            default:
                System.out.println("Error en la opcion seleccinada");
        }   
        
        
        
        
    }
}
