import java.util.List;

public interface LocalizadorRepository {

    public Localizador generarLocalizador(Cliente cliente, Reserva ...reservas);
    public List<Localizador> obtenerLocalizadores();
}
