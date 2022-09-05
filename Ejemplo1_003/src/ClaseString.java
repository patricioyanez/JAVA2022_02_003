public class ClaseString {
    public static void main(String[] args) {
        String nombre;
        nombre = "pedro ";
        
        System.out.println("Largo :" + nombre.length());
        System.out.println("Largo :" + nombre.charAt(2));
        
        String rut = "101009";
        System.out.println("Largo :" + rut.charAt( rut.length()-1));
        
        String valor1 = "a";
        String valor2 = "A";
        
        if(valor1.equals(valor2)) // == 
        {
            System.out.println("Resultado: Verdad");
        }
        else
        {
            System.out.println("Resultado: False");
        }
        
        if(valor1.equalsIgnoreCase(valor2))
            System.out.println("Resultado 2:" + true);
        else
            System.out.println("Resultado 2:" + false);
        
        
        String texto = "Hola Ana Como estas?";
        String patron= "Hola";
        System.out.println("Start:" + texto.startsWith(patron));
        patron= "s?";
        System.out.println("Ends:" + texto.endsWith(patron));
        
        System.out.println("Mayúscula: " + texto.toUpperCase());
        System.out.println("Minúscula: " + texto.toLowerCase());
        System.out.println("texto    : " + texto);
        texto = texto.toUpperCase();
        System.out.println("texto    : " + texto);
        
        String valor3 = "   Elimina espacios     ";
        System.out.println("__" + valor3 + "__");
        System.out.println("__" + valor3.trim() + "__");
    }
}
