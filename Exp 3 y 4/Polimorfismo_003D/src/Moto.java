
public class Moto extends Vehiculo {
    
    @Override
    public void mover()
    {
        System.out.println("La moto se mueve....ran ranran");
    }

    @Override
    public boolean encender(String tipo) {
        if(tipo.equalsIgnoreCase("ELECTRICO"))
            System.out.println("Usar bateria");
        else if(tipo.equalsIgnoreCase("BENCINA"))
            System.out.println("Usar bencina");
        else
            System.out.println("Usar petroleo");
        return true;
    }
}
