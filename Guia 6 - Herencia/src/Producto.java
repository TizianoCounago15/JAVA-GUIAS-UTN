public class Producto {

    /*3. Crea una clase "Producto" que tenga propiedades como "nombre", "precio" y
"cant_stock". Luego, crea dos subclases de "Producto": "Electrónico" y
"Alimenticio". Cada subclase debe tener propiedades específicas como "marca"
y "fecha de caducidad", respectivamente. Utiliza el concepto de herencia para
heredar las propiedades de "Producto" a las subclases.*/
    private String nombre;
    private double precio;
    private int cantStock;

    public Producto(String nombre, double precio, int cantStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantStock = cantStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantStock() {
        return cantStock;
    }

    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantStock=" + cantStock +
                '}';
    }
}
