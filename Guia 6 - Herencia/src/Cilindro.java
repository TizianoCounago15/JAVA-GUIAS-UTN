public class Cilindro extends Circulo {
    private double altura;

    public Cilindro() {
        super();
        this.altura = 1.0;
    }

    public Cilindro(double altura) {
        super();
        this.altura = altura;
    }

    public Cilindro(double altura, double radio) {
        super(radio); // ahora SI asigna el radio
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        // 2π*r*h + 2*areaBase
        return 2 * Math.PI * getRadio() * altura + 2 * super.calcularArea();
    }


    public double calcularVolumen() {
        return super.calcularArea() * altura;  // base * altura
    }

    @Override
    public String toString() {
        return "Cilindro: subclase de " +
                super.toString() +
                " altura=" + altura;
    }
}
