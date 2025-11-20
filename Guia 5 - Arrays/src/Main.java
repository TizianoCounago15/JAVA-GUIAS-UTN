//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*1. Crea un programa que declare un array estático de enteros y luego lo inicialice
con los valores del 1 al 10. Luego, utiliza un bucle for para imprimir cada valor del
array en una línea separada.*/
        int[] numeros = {1,2,3,4,5,6,7,8,9,10} ;
        System.out.println("EJERCICIO 1\n");
        System.out.println("ARREGLO DE NUMEROS");
        for (int i=0; i<numeros.length;i++){
            System.out.print(numeros[i]);
            if(i<9){
                System.out.print(" - ");
            }
        }

        /*2. Crea un programa que declare un array estático de strings y
         luego lo inicialice conalgunos nombres de frutas.
         Luego, utiliza un bucle for para imprimir cada valor
         del array en una línea separada.*/
        String [] frutas = { "Banana", "Pera","Anana"};
        System.out.println("\n\nEJERCICIO 2\n");
        System.out.println("ARREGLO DE FRUTAS\n");
        for (int i=0; i<frutas.length; i++){
            System.out.print(frutas[i]);
            if(i<(frutas.length - 1)){
                System.out.print(", ");
            }
        }

        /*3. Crea un programa que declare un array estático de doubles y luego lo inicialice
con 5 valores. Luego, utiliza un bucle for para calcular la suma de todos los
valores del array.*/
        double [] decimales = {10.5, 30.0,50.0,9.12,100.2};
        System.out.println("\n\nEJERCICIO 3\n");
        System.out.println("ARREGLO DE DECIMALES\n");
        double suma=0;
        for (int i=0; i<decimales.length;i++){
            System.out.print(decimales[i]);
            if(i<decimales.length - 1){
                System.out.print(" - ");
            }
        }
        for (int i=0; i<decimales.length;i++){
            suma=suma+decimales[i];
        }
        System.out.println("\nLa suma de todos los decimales del arreglo es : "+ suma );

        /*A PARTIR DE ACA LAS CONSIGNAS ESTAN EN LAS RESPECTIVAS CLASES */

        System.out.println("\n\nEJERCICIO 4\n");
        Persona[] personas = {
                new Persona("Tiziano","Couñago", "12345678"),
                new Persona("Emilio","Fernandez", "34512912"),
                new Persona("Ariel", "Ortega","9122018")

        } ;

        for (Persona p: personas){
            System.out.println(p.toString());
        }

        /*5. Crea un programa que declare un array estático de enteros y luego lo inicialice
        con algunos valores. Luego, utiliza un bucle for para encontrar el valor máximo
        del array. (Sin utilizar la clase Math)*/
        System.out.println("\n\nEJERCICIO 5\n");
        int [] arreglo = {1,33,0,32,9,12,10,42,30,15};
        int maximo= arreglo[0];
        for (int i=0;i<arreglo.length;i++){
            if(arreglo[i]>maximo){
                maximo=arreglo[i];
            }
        }
        System.out.println("El maximo del arreglo creado es : " + maximo);

        /*6. Crea un programa que declare un array estático de strings y luego lo inicialice con
algunas palabras. Luego, utiliza un bucle for para encontrar la palabra más larga
en el array. (Utilizar el método length() de la clase String)*/

        System.out.println("\n\nEJERCICIO 6 (REUTILIZO EL ARREGLO DEL PUNTO 2)\n");
        String palabraLarga= frutas[0];
        for (String f: frutas){
            if(palabraLarga.length() < f.length()){
                palabraLarga= f;
            }
        }
        System.out.println("La palabra mas larga del arreglo de FRUTAS es " + palabraLarga);

        /*7. Crea un programa que declare dos arrays estáticos de enteros del mismo tamaño
y luego los inicialice con 5 valores a cada uno. Luego, utiliza un bucle for para
calcular la suma de los valores en cada posición de los dos arrays y almacenar los
resultados en un tercer array estático.*/

        int[] arreglito1 = {20, 34, 10, 912, 12};
        int[] arreglito2 = {24, 14, 11, 399, 0};

        System.out.println("\nEJERCICIO 7\n");

        System.out.println("ARREGLO 1:");
        for (int i = 0; i < arreglito1.length; i++) {
            System.out.print(arreglito1[i]);
            if (i < arreglito1.length - 1) {
                System.out.print(" - ");
            }
        }

        System.out.println("\n\nARREGLO 2:");
        for (int i = 0; i < arreglito2.length; i++) {
            System.out.print(arreglito2[i]);
            if (i < arreglito2.length - 1) {
                System.out.print(" - ");
            }
        }

        int[] arreglito3 = new int[arreglito1.length];

        for (int i = 0; i < arreglito1.length; i++) {
            arreglito3[i] = arreglito1[i] + arreglito2[i];
        }

        System.out.println("\n\nARREGLO 3 (Suma elemento por elemento):");
        for (int i = 0; i < arreglito3.length; i++) {
            System.out.print(arreglito3[i]);
            if (i < arreglito3.length - 1) {
                System.out.print(" - ");
            }
        }

        /*8. Crea un programa que declare un array estático de objetos de tipo "Coche" (una
clase que has creado previamente con propiedades como marca, modelo, etc.).
Luego, inicializa el array con algunas instancias de "Coche". Luego, utiliza un
bucle for para imprimir los detalles de cada coche en el array, pero solo aquellos
que tienen una marca determinada. (Utilizar método equals() de la clase String)*/
        Coche[] coches = {
                new Coche("Toyota", "Corolla", 2020),
                new Coche("Toyota", "Yaris", 2019),
                new Coche("Ford", "Focus", 2018),
                new Coche("Chevrolet", "Cruze", 2021)};

        System.out.println("\n\nEJERCICIO 8\n");
        System.out.println("AUTOS DE LA MARCA TOYOTA EN EL ARREGLO: \n");
        for (Coche c: coches){
            if (c.getMarca().equalsIgnoreCase("Toyota")){
                System.out.println(c.toString());
            }
        }
        /*9. Crea un programa que declare un array estático de enteros
        y luego lo inicialice con 5 valores.
        Luego, utiliza un bucle for para calcular el promedio de los valores en el array*/

        System.out.println("\n\nEJERCICIO 9\n");

        int[] numerazos = {10, 20, 30, 40, 50};

        int sumita = 0;

        for (int n : numerazos) {
            sumita += n;
        }

        double promedio = (double) suma / numerazos.length;

        System.out.println("El promedio es: " + promedio);

        /*10. Crea un programa que declare un array estático de strings y luego lo inicialice
con algunas palabras. Luego, utiliza un bucle for para eliminar todas las palabras
que tienen menos de cuatro letras del array y luego imprime el nuevo array
resultante.*/

        String []cadenas = {"Java", "Programacion","if","Double","Int","String"};
        int contador=0;

        //En esta funcion cuento la cantidad de palabras que tienen 4 letras o mas
        //para asignarle la dimension al otro arreglo
        for (int i=0; i< cadenas.length;i++){
            if (cadenas[i].length()>=4){
                contador++;
            }
        }


        String [] cadenasLargas = new String[contador];
        int j=0;
        //Creo la variable j para controlar el arreglo de cadenas de String con palabras largas
        for (int i=0; i< cadenas.length;i++){
            if (cadenas[i].length()>=4){
                cadenasLargas[j]=cadenas[i];
                j++;
            }
        }
        System.out.println("\n\nEJERCICIO 10\n");
        System.out.println("ARREGLO DE PALABRAS:\n");
        for (int i=0; i< cadenas.length;i++){
            System.out.print(cadenas[i] + "\n");
        }

        System.out.println("\nARREGLO DE PALABRAS DE 4 O MAS LETRAS:\n");
        for (int i=0; i< cadenasLargas.length;i++){
            System.out.print(cadenasLargas[i] + "\n");
        }
    }
}