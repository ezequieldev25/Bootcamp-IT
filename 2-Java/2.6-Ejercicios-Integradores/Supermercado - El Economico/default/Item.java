import java.math.BigDecimal;

public class Item {

    private String codigo;
    private String nombre;
    private BigDecimal costoUnitario;

    public Item(String codigo, String nombre, BigDecimal costoUnitario){
        this.codigo = codigo;
        this.nombre = nombre;
        this.costoUnitario = costoUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public BigDecimal getCostoUnitario() {
        return costoUnitario;
    }

    public String getNombre() {
        return nombre;
    }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public void setCostoUnitario(BigDecimal costoUnitario) {
            this.costoUnitario = costoUnitario;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
}
