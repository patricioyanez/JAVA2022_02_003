
import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese numero:");
        int numero;
        int contador = 0;
        numero = leer.nextInt();
        
        while(contador < numero)
        { 
            contador++;// contador += 1;
            System.out.println("Numero:" + contador);
        }
    }
}
