import java.math.BigDecimal;
import java.util.List;

public class Localizador {

    private List<Reserva> reservas;
    private Cliente cliente;
    private BigDecimal total;

    public Localizador(Cliente cliente, BigDecimal total, Reserva ...reservas){
        this.cliente = cliente;
        this.total = total;
        this.reservas = List.of(reservas);
    }   

    public Cliente getCliente() {
        return cliente;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
