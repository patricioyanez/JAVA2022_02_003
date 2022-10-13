
public class Camion extends Vehiculo {
    @Override
    public void mover()
    {
        System.out.println("El Camión se mueve.... miau");
    }

    @Override
    public boolean encender(String tipo) {
        if(tipo.equalsIgnoreCase("ELECTRICO"))
            System.out.println("Usar bateria");
        else
            System.out.println("Usar petroleo");
        return true;
    }
}
