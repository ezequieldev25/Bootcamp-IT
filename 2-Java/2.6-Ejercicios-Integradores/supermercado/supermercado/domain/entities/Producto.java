package domain.entities;

import java.math.BigDecimal;

public class Producto {

    private String codigo;
    private Integer cantidad;
    private BigDecimal costoUnitario;    

    public Producto(String codigo, Integer cantidad, BigDecimal costoUnitario){
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.costoUnitario = costoUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public BigDecimal getCostoUnitario() {
        return costoUnitario;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void setCostoUnitario(BigDecimal costoUnitario) {
        this.costoUnitario = costoUnitario;
    }
}
