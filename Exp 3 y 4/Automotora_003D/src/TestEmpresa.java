public class TestEmpresa {
    public static void main(String[] args) {
        
        Puesto supervisor = new Puesto(1000, "Supervisor");
        Puesto gerente = new Puesto(2000, "Gerente");
        Puesto cajero = new Puesto(4000, "Cajero");
        
        Empleado e1 = new Empleado("1-9", "Juan", "M", 1, 30, supervisor);
        Empleado e2 = new Empleado("2-7", "Luis", "M", 1, 50, gerente);
        Empleado e3 = new Empleado("3-5", "Ana", "F", 1, 20, cajero);
        
        Empresa mall = new Empresa();
        mall.agregar(e1);
        mall.agregar(e2);
        mall.agregar(e3);
        
        mall.listar();
        
        
        if(mall.buscar("1-9"))
            System.out.println("Ya existe el rut");
        else
            System.out.println("NO existe el rut");
               
        if(mall.buscar("11-K"))
            System.out.println("Ya existe el rut");
        else
            System.out.println("NO existe el rut"); 
     
        if(mall.eliminar("1-9"))
            System.out.println("Eliminado el 1-9");
        else
            System.out.println("No existe");
        System.out.println("*******\n\n\n\n\n");
        mall.listar();
    }
}
