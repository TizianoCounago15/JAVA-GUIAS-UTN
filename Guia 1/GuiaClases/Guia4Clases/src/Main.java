//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Tiziano", 21, 'M');
        System.out.println("EJERCICIO 1\n");
        persona.imprimir();

        System.out.println("\nEJERCICIO 2\n");
        Rectangulo rectangulo = new Rectangulo(5.5, 10.0);
        rectangulo.mostrarAreaYPerimetro();

        System.out.println("\nEJERCICIO 3(Hecho con y sin toString)\n");
        Libro libro = new Libro("Pinocho", "Giornale dei Bambini",1880);
        System.out.println("Metodo toString = "+ libro.toString());
        System.out.println("Metodo IMPRIMIR = ");
        libro.imprimir();

        System.out.println("\nEJERCICIO 4\n");
        Vehiculo vehiculo = new Vehiculo("TOYOTA","ETIOS",2018);
        Vehiculo vehiculo1= new Vehiculo("VOLKSWAGEN", "GOLF", 2004);

        System.out.println("Vehiculo 1\n");
        vehiculo.imprimir();
        vehiculo.mostrarAntiguedad();

        System.out.println("\nVehiculo 2\n");
        vehiculo1.imprimir();
        vehiculo1.mostrarAntiguedad();

        System.out.println("\nEJERCICIO 5\n");
        Empleado empleado = new Empleado("23456345", "Carlos", "Gutiérrez", 25000.00);
        Empleado empleado1= new Empleado("34234123", "Ana", "Sanchez", 27500.00);

        System.out.println("\nLISTA DE EMPLEADOS\n");
        empleado.mostrarEmpleado();
        System.out.println("\n");
        empleado1.mostrarEmpleado();

        empleado.cambiarSalario(15.0);
        System.out.println("El salario anual de Carlos con el 15 el aumento es : " + empleado.sueldoAnual());


        System.out.println("\nEJERCICIO 6\n");

        ItemVenta item1 = new ItemVenta("Mouse", 2, 15000);
        ItemVenta item2 = new ItemVenta("Teclado", 1, 42000);
        ItemVenta item3 = new ItemVenta("Monitor", 1, 120000);
        item1.mostrar();
        item2.mostrar();
        item3.mostrar();


        System.out.println("El calculo del monto total del " + item1.getDescripcion() + " es : " + item1.calcularMontoTotal());

        System.out.println("\nEJERCICIO 7\n");

        Autor autor = new Autor("Joshua", "Bloch","joshua@email.com", 'm');
        System.out.println(autor.toString());
        LibroConAutor libroParaEjercicio7 = new LibroConAutor("Effective Java",450.0,150,autor);
        System.out.println(libroParaEjercicio7.toString());
        libroParaEjercicio7.setPrecio(500.0);
        libroParaEjercicio7.setStock(libroParaEjercicio7.getStock()+50);
        System.out.println("\n\nMostrar con los cambios realizados");
        System.out.println(libroParaEjercicio7.toString());
        System.out.println("\n\nMostrar libro con autor y precio");
        libroParaEjercicio7.mostrarAutorDelLibro();

        System.out.println("\nEJERCICIO 8\n");
        Cliente cliente1 = new Cliente("Emiliano", "emiliano@gmail.com.ar", 15.0);
        Cliente cliente2 = new Cliente("Tiziano", "tiziano@gmail.com", 20.0);
        System.out.println("Clientes creado\n");
        cliente1.mostrarCliente();
        cliente2.mostrarCliente();

        Factura factura = new Factura(10000.0, cliente1);

        factura.mostrarFactura();









    }
}