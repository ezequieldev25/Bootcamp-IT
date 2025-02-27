package aplication;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import domain.entities.Cliente;
import domain.entities.Factura;
import domain.entities.Item;
import domain.entities.Producto;
import domain.interfaces.ISupermercado;


public class SupermercadoManagenment implements ISupermercado {

    private Map<String, Producto> productos;
    private Map<String, Cliente> clientes;
    private Map<String, List<Factura>> facturas;

    public SupermercadoManagenment(){
        clientes = new HashMap<>();
        facturas = new HashMap<>();
        productos = new HashMap<>();
    }

    @Override
    public void mostrarClientes() { 
        clientes.values().stream().forEach(System.out::println);
    }

    @Override
    public Cliente eliminarCliente(String dni) {
        return clientes.remove(dni);
    }

    @Override
    public Factura realizarCompra(Cliente cliente, List<Item> items, BigDecimal total) {
        Factura nuevaFactura = new Factura(cliente, items, total);
        facturas.get("1221").add(nuevaFactura);
        return nuevaFactura;        
    };

    private void reducirStock(String codigo, Integer cantidad){
        productos.get(codigo).setCantidad(cantidad);
    }

    @Override
    public void agregarProducto(Producto producto) {
        this.productos.put(producto.getCodigo(), producto);
    }

    @Override
    public void agregarProductos(Producto... productos) {
        Stream.of(productos).forEach(p -> this.productos.put(p.getCodigo(), p));
    }

}
