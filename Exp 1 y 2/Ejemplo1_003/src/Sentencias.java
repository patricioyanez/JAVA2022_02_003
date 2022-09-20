public class Sentencias {
    public static void main(String[] args) {
        // declarar 2 variables
        int numero1;
        numero1 = 10;
        int numero2 = 10;
        
        if(numero1 == numero2)
        {
            System.out.println("Los numero son iguales");
        }
        
        numero2 = 20;
        if(numero1 == numero2)
        {
            System.out.println("Ejemplo2: Los numeros son iguales");
        }
        else
        {
            System.out.println("Ejemplo2: Los numeros NO son iguales");
        }
        
        int edad = 5;
        if(edad < 12)
        {
            System.out.println("Ud es un niño");
        }
        else if(edad < 18)
        {
            System.out.println("Adolescente");
        }
        else if(edad < 65)
        {
            System.out.println("Adulto");
        }
        else
        {
            System.out.println("Adulto mayor");
        }
        
        
    }
}
