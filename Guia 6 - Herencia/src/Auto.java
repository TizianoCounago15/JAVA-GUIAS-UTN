public class Auto extends Vehiculo{
    private int cantidadDePuertas;

    public Auto(String marca, String modelo, int anio, double precio, int cantidadDePuertas) {
        super(marca, modelo, anio, precio);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    @Override
    public String toString() {
        return  super.toString() + " \nAUTO{" +
                "cantidadDePuertas=" + cantidadDePuertas +
                '}'+"\n";
    }
}
