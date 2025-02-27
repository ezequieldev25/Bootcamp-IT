package domain.entities;

import java.math.BigDecimal;
import java.util.List;

public class Factura {

    private Cliente cliente;
    private List<Item> itemsComprados;
    private BigDecimal totalDeCompra;
    
    public Factura(Cliente cliente, List<Item> itemsComprados, BigDecimal totalDecimal){
        this.cliente = cliente;
        this.itemsComprados = itemsComprados;
        this.totalDeCompra = totalDecimal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Item> getItemsComprados() {
        return itemsComprados;
    }

    public BigDecimal getTotalDeCompra() {
        return totalDeCompra;
    }
}
