public class Vehiculo {

    /*2. Crea una clase "Vehículo" que tenga propiedades como "marca", "modelo",
"año" y "precio". Luego, crea dos subclases de "Vehículo": "Auto" y "Camión".
Cada subclase debe tener propiedades específicas como "cantidad de puertas" y
"capacidad de carga", respectivamente. Utiliza el concepto de herencia para
heredar las propiedades de "Vehículo" a las subclases.*/

    private String marca;
    private String modelo;
    private int anio;
    private double precio;

    public Vehiculo(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "Marca='" + marca + '\'' +
                ", Modelo='" + modelo + '\'' +
                ", Anio=" + anio +
                ", Precio=" + precio +
                '}';
    }
}
