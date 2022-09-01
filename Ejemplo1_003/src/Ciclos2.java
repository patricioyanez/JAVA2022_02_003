
import java.util.Scanner;


public class Ciclos2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        int apruebo = 0;
        int rechazo = 0;
        int otro = 0;
        
        while(opcion != 4)
        {
            System.out.println("Indique su voto:");
            System.out.println("1.- Apruebo");
            System.out.println("2.- Rechazo");
            System.out.println("3.- Nulo o Blanco");
            System.out.println("4.- Cerra mesa");
            System.out.print("Ingrese su opcion:");
            opcion = leer.nextInt();

            if(opcion < 1 || opcion > 4)
                System.out.println("Opción no es válido");
            else
            {
                if(opcion == 1)
                    apruebo++;
                else if(opcion == 2)
                    rechazo++;
                else if(opcion == 3)
                    otro++;      
            }
        }
        System.out.println("*** Mesa cerrada ***");
        System.out.println("Resultados:");
        System.out.println("Apruebo     : " + apruebo);
        System.out.println("Apruebo     : " + rechazo);
        System.out.println("Nulo/Blanco : " + otro);
        System.out.println("Total votos : " + (apruebo+rechazo+otro));
    }    
}
