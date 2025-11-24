public class Alimenticio extends Producto {

    private String fechaCaducidad;

    public Alimenticio(String nombre, double precio, int cantStock, String fechaCaducidad) {
        super(nombre, precio, cantStock);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nALIMENTICIO{" +
                "fechaCaducidad='" + fechaCaducidad + '\'' +
                "}\n";
    }
}
