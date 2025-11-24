public class Electronico extends Producto {

    private String marca;

    public Electronico(String nombre, double precio, int cantStock, String marca) {
        super(nombre, precio, cantStock);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nELECTRONICO{" +
                "marca='" + marca + '\'' +
                "}\n";
    }
}