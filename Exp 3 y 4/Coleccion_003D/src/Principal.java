
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // crear array list
        ArrayList<String> nombres = new ArrayList<String>();
        
        ArrayList<String> nombres2;        
        nombres2 = new ArrayList<String>();
        
        // agregar
        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Juana");
        nombres.add("Luis");
        System.out.println(nombres);
        
        System.out.println("valor indice 2: " + nombres.get(2));
        
        nombres.set(2, "Alberta");
        System.out.println("valor indice 2: " + nombres.get(2));
        
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Nombres: " + nombres.get(i));
        }
        
        System.out.println("For each (optimizado)");
        for (String aux : nombres) {
            System.out.println("Nombre: " + aux);
        }
        
        nombres.remove(2);
        System.out.println(nombres);
        nombres.remove("Ana");
        System.out.println(nombres);
        
        boolean res = nombres.contains("Luis");
        if (res) {
            System.out.println("Luis está");
        } else {
            System.out.println("Luis no está");
        }
        System.out.println("Cantidad de elementos " + nombres.size() );
        nombres.clear();
        System.out.println("Cantidad de elementos " + nombres.size() );
    }
}
