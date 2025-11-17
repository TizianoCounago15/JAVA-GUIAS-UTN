public class LibroConAutor{
    /* 7)Es necesario modelar el objeto de tipo Libro con las siguientes
características, título, precio, stock y Autor, este último posee las
características de nombre, apellido, email y género ( ‘M’ o ‘F’ ). Para este
ejercicio vamos a asumir que un libro tiene un único autor. Ejecute las
siguientes instrucciones:
a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”,
“joshua@email.com”, ’M’.
b. Imprima por pantalla al autor previamente instanciado.
c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta
450 pesos con una cantidad de 150 copias.
d. Imprima por pantalla el libro instanciado.
e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente
la cantidad en 50 copias.
f. Imprima por pantalla los atributos del Autor Joshua, accediendo
desde el Libro “Effective Java”.
g. Agregue un método a la clase Libro que posibilite imprimir en
pantalla el siguiente mensaje: “El libro, {título} de {nombre del autor}.
Se vende a {precio} pesos.”*/

    private String titulo;
    private double precio;
    private int stock;

    private Autor autor;

    public LibroConAutor(String titulo, double precio, int stock, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "\nLibro con autor{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autor=" + autor +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void mostrarAutorDelLibro(){
        System.out.println("Libro : " + titulo + "\n" +
                "Autor : " + autor.getNombre() + " " + autor.getApellido() + "\n" +
                "Email : " + autor.getEmail());
        if(autor.getGenero()== 'M'){
            System.out.println("Genero : Masculino");
        }else {
            if(autor.getGenero() == 'F'){
            System.out.println("Genero : Femenino");
        }else {
                System.out.println("Genero : indefinido");
            }
        System.out.println("Se vende a " + precio + " pesos");
    }
}}
