package domain.interfaces;

import java.math.BigDecimal;
import java.util.List;

import domain.entities.Cliente;
import domain.entities.Factura;
import domain.entities.Item;
import domain.entities.Producto;


public interface ISupermercado {
    
    void mostrarClientes();
    Cliente eliminarCliente(String dni);
    Factura realizarCompra(Cliente cliente, List<Item> items, BigDecimal total);
    void agregarProducto(Producto producto);
    void agregarProductos(Producto ...productos);
}
