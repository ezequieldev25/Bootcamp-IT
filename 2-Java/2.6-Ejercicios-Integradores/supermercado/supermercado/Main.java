import java.math.BigDecimal;
import java.util.List;

import aplication.SupermercadoManagenment;
import domain.entities.Cliente;
import domain.entities.Producto;
import domain.interfaces.ISupermercado;

public class Main {

    public static void main(String[] args) {        
        // DATOS 
        Cliente cliente = new Cliente("12345678", "Gian", "Nor");
        Cliente cliente2 = new Cliente("12345679", "Lucas", "Nach");
        Cliente cliente3 = new Cliente("12345680", "Jimena", "Fiali");
        
        Producto producto1 = new Producto("KJKS2", 20, BigDecimal.valueOf(10));
        Producto producto2 = new Producto("KJKS3", 10, BigDecimal.valueOf(50));
        Producto producto3 = new Producto("KJKS4", 40, BigDecimal.valueOf(5));

        List<Producto> productos = List.of(producto1, producto2, producto3);

        ///
        ISupermercado supermercadoManangenment = new SupermercadoManagenment();
        supermercadoManangenment.agregarProductos();

        //supermercadoManangenment.realizarCompra(cliente, producto1, BigDecimal.valueOf(1202002));


    }
}
