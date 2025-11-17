public class Empleado {
    /*Modele el objeto “Empleado” que posee las siguientes características, dni,
nombre, apellido y salario. El mismo debe contar con la posibilidad de calcular
el salario anual. A su vez se requiere otro método que permita aumentar el
salario dependiendo del porcentaje que se le pase por parámetro. Considere
crear un método que facilite imprimir por pantalla las características del objeto
de la siguiente forma:

Empleado[dni=?, nombre=?, apellido=?, salario=?]
1. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial
de 25000.
2. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de
27500.
3. Imprima ambos objetos por pantalla
4. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla
el salario anual del mismo.*/
    private String dni;
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado(String dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public void mostrarEmpleado(){
        System.out.println("EMPLEADO : " + nombre + apellido);
        System.out.println("DNI : " + dni);
        System.out.println("SALARIO : " + salario);
    }

    public double cambiarSalario(double porcentaje){
        return  salario += salario *(porcentaje/100);
    }

    public double sueldoAnual (){
        return salario*12;
    }


}
