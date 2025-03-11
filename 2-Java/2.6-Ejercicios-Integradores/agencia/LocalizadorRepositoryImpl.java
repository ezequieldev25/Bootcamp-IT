import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LocalizadorRepositoryImpl implements LocalizadorRepository {

    private List<Localizador> localizadores;

    public LocalizadorRepositoryImpl(){
        localizadores = new ArrayList<>();
    }

    @Override
    public Localizador generarLocalizador(Cliente cliente, Reserva... reservas) {
        BigDecimal total = BigDecimal.valueOf(0);
        Stream.of(reservas).map(r ->total.add(r.getTotal()));
        localizadores.add(new Localizador(cliente, total, reservas));
    }

    @Override
    public List<Localizador> obtenerLocalizadores() {
        throw new UnsupportedOperationException("Unimplemented method 'obtenerLocalizadores'");
    }
}
