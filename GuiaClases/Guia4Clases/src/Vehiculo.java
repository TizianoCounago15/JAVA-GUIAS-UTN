import java.time.LocalDate;

public class Vehiculo {
    /*4. Crea una clase "Vehiculo" con atributos de marca, modelo y año de fabricación.
Crea un método público para imprimir los detalles del vehículo y otro para
determinar si es un vehículo antiguo (más de 10 años desde la fecha actual).*/
    private String marca;
    private String modelo;
    private int anioFabricacion;

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

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Vehiculo(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    public void imprimir(){
        System.out.println("Marca : " + marca);
        System.out.println("Modelo : " + modelo);
        System.out.println("Año : " + anioFabricacion);
    }

    public boolean determinarNuevoOAntiguo() {
        int anioActual = LocalDate.now().getYear();
        return (anioActual - anioFabricacion) < 10;
    }

    public void mostrarAntiguedad(){
        if(determinarNuevoOAntiguo()){
            System.out.println("El vehiculo es nuevo");
        }else {
            System.out.println("El vehiculo es antiguo");
        }
    }

}
