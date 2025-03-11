import java.util.HashMap;
import java.util.Map;

public class ClienteRepositoryImpl implements ClienteRepository {

    private Map<String, Cliente> clientes; 

    public ClienteRepositoryImpl(){
        clientes = new HashMap<>();
    }

    @Override
    public Cliente agregarCliente(Cliente cliente) {
        if(!clientes.containsKey(cliente.getDni())) throw new IllegalAccessError("El cliente no esta en el sistema");
        return clientes.put(cliente.getDni(), cliente);
    }
}
