import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Tiziano", 21);
        persona.saludar();

        /*Ejercicio 1

Realizar un programa Java que haga lo siguiente:
Declarar una variable numN de tipo int, una variable numA de tipo double y
una variable numC de tipo char, y asignarles un valor.
Mostrar por pantalla:

- El valor de cada variable.

- La suma de numN + numA.

- La diferencia de numA - numN.

- El valor numérico correspondiente al carácter que contiene la variable numC.*/


        int numN = 10;
        double numA = 5.5;
        char numC = 'a';

        System.out.println("EJERCICIO 1");

        System.out.println("A) Variable N = " + numN + "\n" + "Variable A = " + numA + "\n" + "Variable C = " + numC);
        System.out.println("\nB) La suma entre N y A es : " + (numN+numA) + "\n");
        System.out.println("C) La letra " + numC + " en la tabla ASCII es el " + (int)numC);

        /*Ejercicio 2
Declara dos variables numéricas (con el valor que desees) y muestra por consola:

- La suma
- La resta
- La multiplicación
- La división
- El módulo (resto de la división)*/
        int valor1 = 1000;
        int valor2= 250;
        System.out.println("\nEJERCICIO 2\n");
        System.out.println("Valor 1 = " + valor1 + " - Valor 2 = " + valor2 + "\n");
        System.out.println("Suma = " + (valor1+valor2) + "\nResta = " + (valor1-valor2) +
                "\nMultiplicacion = " + (valor1*valor2) + "\nDivision = " + (valor1/valor2) +
                "\nModulo (resto de la division) = " + (valor1%valor2));
        /*Ejercicio 3
           Declara dos variables numéricas (con el valor que desees)
           e indica cuál es mayor de los dos.
           si son iguales, indícalo también.*/

        int variable1 = 32;
        int variable2 = 43;

        System.out.println("\nEJERCICIO 3\n");
        System.out.println("La variable 1 es : " + variable1 + " - La variable 2 es : " + variable2);
        if(variable1>variable2){
            System.out.println("Variable 1 es mayor");
        }else{
            if (variable1<variable2){
                System.out.println("Variable 2 es mayor");
            }else{
                System.out.println("Las variables son iguales");
            }
        }



        /*Ejercicio 4

           Declara un String que contenga tu nombre.
           Después, muestra un mensaje de bienvenida por consola.
           Por ejemplo, si introduzco “Fernando”, debe aparecer:

           Bienvenido Fernando*/
        String nombre = "Tiziano";
        System.out.println("\nEJERCICIO 4\n");
        System.out.println("Bienvenido! Mi nombre es " + nombre);

        /*Ejercicio 5

             Modifica el ejercicio anterior para que el nombre se introduzca por teclado.*/
        String nombreTeclado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEJERCICIO 5\n");
        System.out.println("\nIngrese su nombre por teclado");
        nombreTeclado = scanner.nextLine();

        System.out.println("Su nombre es: " + nombreTeclado);


        /*Ejercicio 6

             Lee un número por teclado e indica si es divisible entre 2 (resto = 0).*/
        Scanner scanner1 = new Scanner(System.in);
        int numeroDivisible;
        System.out.println("\nEJERCICIO 6 \n");
        System.out.println("Ingrese un numero para saber si es divisible por 2\n");
        numeroDivisible= scanner1.nextInt();
        scanner1.nextLine();

        if (numeroDivisible % 2 == 0){
            System.out.println("El numero " + numeroDivisible + " es divisible por 2");
        }else {
            System.out.println("El numero " + numeroDivisible + " NO es divisible por 2");
        }

        /*Ejercicio 7

             Lee un número por teclado y muestra la tabla de multiplicar de ese número (del 1 al 10).*/
        int numeroMultiplicar;
        System.out.println("\nEJERCICIO 7\n");
        System.out.println("Ingrese un numero el cual desea ver la tabla de multiplicar\n");
        numeroMultiplicar = scanner1.nextInt();
        scanner1.nextLine();
        System.out.println("\t\t\t Tabla del " + numeroMultiplicar + "\n");
        for (int i =1; i<11; i++){
            System.out.print((numeroMultiplicar * i));
            if (i < 10) {
                System.out.print(" - ");
            }
        }

        /*Ejercicio 8

             Muestra los números del 1 al 100 (ambos incluidos).
             Usa un bucle while.*/
        int entero=1;
        System.out.println("\nEJERCICIO 8\n");
        System.out.println("\t\t\tNUMEROS DEL 1 AL 100");
        while(entero<101){
            System.out.print(entero);
            if(entero<100){
                System.out.print(" - ");
            }
            entero++;
        }

        /*Ejercicio 9

             Muestra los números del 1 al 100 (ambos incluidos) que sean divisibles entre 2 y entre 3.
             Usa un bucle for.*/
        System.out.println("\nEJERCICIO 9\n");
        System.out.println("\t\t\tNUMEROS DIVISIBLES POR 2 Y POR 3");
        for (int i=1; i<101;i++){
            if((i % 2 == 0) && (i % 3 == 0)){
            System.out.print(i);
                if(i<100){
                    System.out.print(" - ");
                }
            }
         }
}}