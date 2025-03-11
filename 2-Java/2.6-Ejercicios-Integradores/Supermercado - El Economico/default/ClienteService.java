import java.util.List;

public interface ClienteService {
    
    public Cliente agregarCliente(Cliente cliente);
    public Cliente eliminarCliente(String dni);
    public Cliente modificarCliente(String dni, Cliente cliente);
    public List<Cliente> obtenerClientes();
}
