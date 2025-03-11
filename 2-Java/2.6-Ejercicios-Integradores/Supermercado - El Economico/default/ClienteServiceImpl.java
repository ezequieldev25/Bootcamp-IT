import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteServiceImpl implements ClienteService {

    private Map<String, Cliente> clientes;

    public ClienteServiceImpl(){
        clientes = new HashMap<>();
    }

    @Override
    public Cliente agregarCliente(Cliente cliente) {
        if(clientes.keySet().contains(cliente.getDni())){
            throw new IllegalArgumentException("El cliente ya se encuentra registrado");
        }
        return clientes.put(cliente.getDni(), cliente);
    }

    @Override
    public Cliente eliminarCliente(String dni) {
        if (!clientes.keySet().contains(dni)) {
            throw new IllegalArgumentException("El cliente no se encuentra en el sistema");
        }
        return clientes.remove(dni);
    }

    @Override
    public Cliente modificarCliente(String dni, Cliente cliente) {
        if(!clientes.keySet().contains(dni)){
            throw new IllegalArgumentException("El cliente no se encuentra en el sistema");
        }

        return clientes.put(dni, cliente);
    }

    @Override
    public List<Cliente> obtenerClientes() {
        return clientes.values().stream().toList();
    }
    
}
