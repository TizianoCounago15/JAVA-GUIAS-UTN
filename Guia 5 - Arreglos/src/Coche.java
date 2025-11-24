public class Coche {
    /*8. Crea un programa que declare un array estático de objetos de tipo "Coche" (una
clase que has creado previamente con propiedades como marca, modelo, etc.).
Luego, inicializa el array con algunas instancias de "Coche". Luego, utiliza un
bucle for para imprimir los detalles de cada coche en el array, pero solo aquellos
que tienen una marca determinada. (Utilizar método equals() de la clase String)*/

    private String marca;
    private String modelo;
    private int anioDeEstreno;

    public Coche(String marca, String modelo, int anioDeEstreno) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioDeEstreno = anioDeEstreno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioDeEstreno() {
        return anioDeEstreno;
    }

    public void setAnioDeEstreno(int anioDeEstreno) {
        this.anioDeEstreno = anioDeEstreno;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anioDeEstreno=" + anioDeEstreno +
                '}';
}
}
