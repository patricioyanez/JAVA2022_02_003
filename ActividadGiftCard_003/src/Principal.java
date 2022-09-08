
public class Principal {
    public static void main(String[] args) {
        long codigoInicial = 1000000000000l;
        
        Trabajador t1 = new Trabajador();
        Trabajador t2 = new Trabajador(20100300, "K", "Ana");
        
        t1.setRut(10300100);
        t1.setDv("1");
        t1.setNombre("Juan");
        
        GiftCard g1 = new GiftCard();
        GiftCard g2 = new GiftCard();
        
        codigoInicial = g1.generarCodigo(codigoInicial);
        codigoInicial = g2.generarCodigo(codigoInicial);
        
        System.out.println("Codigo g1: " + g1.getCodigo());
        System.out.println("Codigo g2: " + g2.getCodigo());
        
        g1.setTrabajor(t1);
        g2.setTrabajor(t2);
        
        System.out.println("Clave g1: " + g1.getClave());
        System.out.println("Clave g2: " + g2.getClave());
        g1.generarClave();
        g2.generarClave();
        System.out.println("Clave g1: " + g1.getClave());
        System.out.println("Clave g2: " + g2.getClave());
    }
}
