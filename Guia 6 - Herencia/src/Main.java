import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 1\n");
        System.out.println("=== PRIMER CILINDRO ===");
        Cilindro c1 = new Cilindro();
        System.out.println(c1);
        System.out.println("Radio: " + c1.getRadio());
        System.out.println("Altura: " + c1.getAltura());
        System.out.println("Área de la base: " + c1.calcularArea());
        System.out.println("Volumen: " + c1.calcularVolumen());

        System.out.println("\n=== SEGUNDO CILINDRO ===");
        Cilindro c2 = new Cilindro(5.0, 3.0);
        System.out.println(c2);
        System.out.println("Radio: " + c2.getRadio());
        System.out.println("Altura: " + c2.getAltura());
        System.out.println("Área de la base: " + c2.calcularArea());
        System.out.println("Volumen: " + c2.calcularVolumen());

        //CONSIGNA EN CLASE VEHICULO
        System.out.println("\n\nEJERCICIO 2\n");
        Auto auto1 = new Auto("FIAT", "PUNTO", 2018,3500000, 4);
        Auto auto2 = new Auto("TOYOTA", "ETHIOS", 2023, 5500000,4);
        Camion camion1 = new Camion("MERCEDES-BENZ", "ATEGO 1726", 2018, 55000000, 12000);
        Camion camion2 = new Camion("SCANIA", "P340", 2020, 88000000, 18000);
        System.out.println("VEHICULOS DISPONIBLES\n");
        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(camion1);
        System.out.println(camion2);

        //CONSIGNA EN CLASE PRODUCTO
        System.out.println("\n\nEJERCICIO 3\n");

        Electronico e1 = new Electronico("TELEVISOR 55\"", 450000, 10, "SAMSUNG");
        Electronico e2 = new Electronico("NOTEBOOK", 750000, 5, "LENOVO");
        Alimenticio a1 = new Alimenticio("LECHE", 950, 40, "12/2025");
        Alimenticio a2 = new Alimenticio("GALLETITA", 1200, 20, "03/2026");

        System.out.println("PRODUCTOS DISPONIBLES\n");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(a1);
        System.out.println(a2);

        /*4. Vamos a diseñar un programa que nos permita gestionar el personal que
concurre a un colegio. Para no hacerlo muy extenso vamos a limitarnos a
estudiantes y miembros de staff que a diferencia de los estudiantes, estos
perciben una remuneración. Ambos tipos comparten la característica de Persona
que posee los atributos de dni, nombre, apellido, email y dirección.
Por otro lado tenemos al Estudiante que posee las características de Persona y
las de un estudiante, que en este caso son, año de ingreso, cuota mensual y
carrera.
Y finalmente tenemos al miembro de Staff que también es una Persona pero
con características propias de alguien que trabaja para una institución, por
ejemplo salario y turno, este puede ser mañana o noche.
Diagramar el UML identificando superclase y subclases, crear constructores
necesarios, getters y setters, métodos de ayuda como salario anual y toString
para facilitar la impresión.

● Inicializar 4 estudiantes diferentes.
● Inicializar 4 miembros de staff con características diferentes.
● Crear un array que permita almacenar juntos los tipos anteriores y almacenar
las 8 instancias creadas anteriormente.
● Investigar el uso de la palabra reservada instanceof.
● Recorrer el array y mostrar por pantalla la cantidad de estudiantes y la
cantidad de miembros de staff.
● Recorrer el array y sumar el total de ingresos que percibe la institución por
parte de la cuota de estudiantes.Tambien, informar los ingresos ANUALES de la institucion*/

        System.out.println("EJERCICIO 4\n");
        ArrayList<Persona> personas = new ArrayList<>();
        GestorPersonas gestorPersonas = new GestorPersonas(personas);
        gestorPersonas.cargaPersonas();
        System.out.println(gestorPersonas);
        System.out.println("\nCANTIDAD DE ESTUDIANTES Y DE STAFF");
        gestorPersonas.mostrarCantidades();
        gestorPersonas.muestraIngresos();
    }
}
