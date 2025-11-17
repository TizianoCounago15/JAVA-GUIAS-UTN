public class Libro {

    /*3. Crea una clase "Libro" con atributos de título, autor y año de publicación. Crea
un método público para imprimir los detalles del libro*/
    private String titulo;
    private String autor;
    private int aniopublicacion;

    public Libro(String titulo, String autor, int aniopublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.aniopublicacion = aniopublicacion;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", aniopublicacion=" + aniopublicacion +
                '}';
    }
    public void imprimir() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + aniopublicacion);
    }
}
