import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Factura {
    private static int idAutoincremental=0;
    private int id;
    private double montoTotal;
    private LocalDateTime fecha;
    private Cliente cliente;

    public Factura(double montoTotal, Cliente cliente) {
        this.id = ++idAutoincremental;
        this.montoTotal = montoTotal;
        this.fecha = LocalDateTime.now();
        this.cliente = cliente;
    }

    public double calcularDescuento(){
        return (montoTotal - (montoTotal* cliente.getPorcentajeDescuento()/ 100));
    }


    public void mostrarFactura() {
        System.out.println("Factura[id=" + id +
                ", fecha=" + fecha +
                ", monto=" + montoTotal +
                ", montoDesc=" + calcularDescuento() + ", ");
        cliente.mostrarCliente();  // imprime el cliente
        System.out.println("]");
    }





}
