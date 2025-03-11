
public class Main {
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente("12345", "Nombre2", "Apellido2");
        Cliente cliente2 = new Cliente("12345", "Nombre3", "Apellido3");
        Cliente cliente3 = new Cliente("12345", "Nombre4", "Apellido4");
    
        ClienteService clienteService = new ClienteServiceImpl();

        clienteService.agregarCliente(cliente);
        clienteService.agregarCliente(cliente2);
        clienteService.agregarCliente(cliente3);

        System.out.println(clienteService.obtenerClientes());
    }
}
