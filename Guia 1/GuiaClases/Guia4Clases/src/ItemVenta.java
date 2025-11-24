public class ItemVenta {
    /*Modele el objeto “ItemVenta” con las siguientes propiedades,
identificador, descripción, cantidad y precio unitario. Cree los métodos para
calcular el precio total teniendo en cuenta el precio unitario y cantidad. Un
método que permita imprimir por pantalla los atributos del objeto de la
siguiente forma:
ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
a. Inicialice el objeto con los atributos necesarios
b. Imprima por pantalla el objeto inicializado*/

    private static int idAutoincremental=0;

    private int identificador;
    private String descripcion;
    private int cantidad;
    private double precio_unitario;

    public ItemVenta(String descripcion, int cantidad, double precio_unitario) {
        this.identificador = ++idAutoincremental;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
    }

    public double calcularMontoTotal(){
        return precio_unitario*cantidad;
    }

    public void mostrar(){
        System.out.println("ID : "+ identificador);
        System.out.println("DESCRIPCION: " + descripcion);
        System.out.println("CANTIDAD : " + cantidad);
        System.out.println("PRECIO UNITARIO : " + precio_unitario + "\n");
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }
}
