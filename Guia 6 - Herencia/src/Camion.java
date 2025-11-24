public class Camion extends Vehiculo{
    private double pesoQueResiste;

    public Camion(String marca, String modelo, int anio, double precio, double pesoQueResiste) {
        super(marca, modelo, anio, precio);
        this.pesoQueResiste = pesoQueResiste;
    }

    public double getPesoQueResiste() {
        return pesoQueResiste;
    }

    public void setPesoQueResiste(double pesoQueResiste) {
        this.pesoQueResiste = pesoQueResiste;
    }

    @Override
    public String toString() {
        return  super.toString() + " \nCAMION{" +
                "Peso que resiste =" + pesoQueResiste +
                '}' +"\n";
    }

}
