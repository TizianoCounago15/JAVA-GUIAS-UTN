public class Persona {

    /*1. Crea una clase "Persona" con atributos de nombre, edad y género. Crea un
método público para imprimir los detalles de una persona.*/
    private  String nombre;
    private int edad;
    private char genero;

    public Persona(String nombre, int edad, char genero) {
        if (edad < 0){
            edad = 0;
        }

        genero = Character.toUpperCase(genero); //Convierto el valor a mayuscula
        if(genero != 'F' && genero != 'M'){
            genero ='N';
        }
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public void imprimir(){
        if(genero=='N'){
            System.out.println("Mi nombre es " + nombre + " tengo " + edad + " y no tengo genero definido");

        }else {
            if(genero == 'F'){
                System.out.println("Mi nombre es " + nombre + " tengo  " + edad +  " y soy genero femenino");
            }else {
                System.out.println("Mi nombre es " + nombre + " tengo  " + edad +  " y soy genero masculino");
            }
        }
    }

}
