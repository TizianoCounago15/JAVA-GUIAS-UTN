import java.util.ArrayList;
import java.util.Arrays;

public class GestorPersonas {
    private ArrayList<Persona> personas;

    public GestorPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public void cargaPersonas(){
        Estudiante estudiante1 = new Estudiante("40111222", "Juan", "Perez", "juan@gmail.com", "Rivadavia 123", 2022, 15000.0, "Ingeniería");
        Estudiante estudiante2 = new Estudiante("40222333", "Maria", "Lopez", "maria@gmail.com", "Belgrano 456", 2023, 18000.0, "Sistemas");
        Estudiante estudiante3 = new Estudiante("40333444", "Lucas", "Gomez", "lucas@gmail.com", "Colon 789", 2021, 17000.0, "Industrial");
        Estudiante estudiante4 = new Estudiante("40444555", "Ana", "Martinez", "ana@gmail.com", "San Juan 234", 2024, 16000.0, "Electromecánica");

        Staff staff1 = new Staff("30111222", "Carlos", "Suarez", "carlos@colegio.com","Rawson 100", 350000.0, Turno.MANIANA);
        Staff staff2 = new Staff("30222333", "Laura", "Fernandez", "laura@colegio.com", "Alvarado 200", 380000.0, Turno.NOCHE);
        Staff staff3 = new Staff("30333444", "Diego", "Ramirez", "diego@colegio.com", "Mitre 300", 360000.0, Turno.MANIANA);
        Staff staff4 = new Staff("30444555", "Paula", "Gimenez", "paula@colegio.com", "Independencia 400", 390000.0, Turno.NOCHE);

        personas.add(estudiante1);
        personas.add(estudiante2);
        personas.add(estudiante3);
        personas.add(estudiante4);
        personas.add(staff1);
        personas.add(staff2);
        personas.add(staff3);
        personas.add(staff4);
    }

    public int cantEstudiantes(){
        int cantidad=0;
        for (Persona p:personas){
            if(p instanceof Estudiante) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public int cantStaff(){
        int cantidad=0;
        for (Persona p:personas){
            if(p instanceof Staff) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public void mostrarCantidades(){
        System.out.println("Estudiantes : " + cantEstudiantes()+ "\n" +
                "Staff : " + cantStaff()+ "\n");
    }

    @Override
    public String toString() {
        return "GestorPersonas{" +
                "personas=" + personas +
                '}';
    }

    public double ingresosInstitucionales(){
        double ingresos=0;
        for (Persona p : personas){
            if (p instanceof Estudiante){
                ingresos= ingresos + ((Estudiante) p).getCuotaMensual();
            }
        }

        return ingresos;
    }

    public void muestraIngresos(){
        System.out.println("INGRESOS DE LA INSTITUCION\nMENSUAL : " + ingresosInstitucionales()
        + "\nANUAL : " + (ingresosInstitucionales()*12));
    }
}
