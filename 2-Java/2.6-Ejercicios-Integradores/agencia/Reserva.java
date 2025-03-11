import java.math.BigDecimal;

public class Reserva {

    private String tipo;
    private BigDecimal total;

    public Reserva(String tipo, BigDecimal total){
        this.tipo = tipo;
        this.total = total;
    }

    public String getTipo() {
        return tipo;
    }

    public BigDecimal getTotal() {
        return total;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
