
public class Principal {
    public static void main(String[] args) {
        AlumnoGratuidad ag = new AlumnoGratuidad();
        ag.setRut(1000);
        ag.setNombre("Juan");
        ag.setCarrera("Parvulo");
        ag.setAprobado(true);
        
        System.out.println(ag.datos());
        
        Persona p1 = new Persona();
        p1.setRut(1);
        p1.setNombre("Ana");
        System.out.println(p1.toString());
        Alumno a1 = new Alumno();
        a1.setRut(2);
        a1.setNombre("Pedro");
        a1.setCarrera("Agronomía");
        System.out.println(a1.toString());
        AlumnoGratuidad ag1 = new AlumnoGratuidad();
        ag1.setRut(3);
        ag1.setNombre("Anacleto");
        ag1.setCarrera("Paleontología");
        ag1.setAprobado(false);
        System.out.println(ag1.toString());
        
        // realizar ejericicio 4_1_2
    }
}
