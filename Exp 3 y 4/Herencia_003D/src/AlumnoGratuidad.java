
public class AlumnoGratuidad extends Alumno {
    private boolean aprobado;
    
    public AlumnoGratuidad()
    {
        super();
        System.out.println("Alumno con gratuidad...");
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    @Override
    public String toString() {
        return "*** Datos Alumno Gratuidad ***" + 
                "\nRut      :   " + getRut()+ 
                "\nNombre   :   " + getNombre() + 
                "\nCarrera  :   " + getCarrera()+ 
                "\nAprobado :   " + (this.aprobado?"Si":"No") 
                ;
    }
    // sobre escritura
    public String datos() {
        return "*** Datos Alumno Gratuidad ***" + 
                "\nRut      :   " + getRut()+ 
                "\nNombre   :   " + getNombre() + 
                "\nCarrera  :   " + getCarrera()+ 
                "\nAprobado :   " + (this.aprobado?"Si":"No") 
                ;
    }
    // sobre carga
    public void calcularMatricula()
    {
        if(this.aprobado)
            System.out.println("Matricula costo cero");
        else
            System.out.println("Debe esperar la aprobación");
    }
    public void calcularMatricula(int valor)
    {
        System.out.println("El valor es: " + valor);
    }
    public void calcularMatricula(int valor, int descuento)
    {
        int res = valor - (valor * descuento / 100);
        System.out.println("El valor es: " + (int)res);
    }
    
}
