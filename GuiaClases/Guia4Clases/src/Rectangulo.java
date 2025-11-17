public class Rectangulo {
    /*2. Crea una clase "Rectángulo" con atributos de ancho y largo. Crea un método
público para imprimir el área y el perímetro del rectángulo.*/
    private double ancho;
    private double largo;

    public Rectangulo(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
    }
    public double calcularArea(){
        return (ancho*largo);
    }

    public double calcularPerimetro(){
        return (ancho+largo)*2;
    }

    public void mostrarAreaYPerimetro(){
        if (ancho<=0 && largo<=0){
            System.out.println("Esto no puede ser un rectangulo");
        }else {
            System.out.println("¡RECTANGULO!");
            System.out.println("AREA: " + calcularArea());
            System.out.println("PERIMETRO: " + calcularPerimetro());
        }
    }
}
