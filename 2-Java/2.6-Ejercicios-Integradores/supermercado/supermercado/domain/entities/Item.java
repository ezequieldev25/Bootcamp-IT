package domain.entities;

import java.math.BigDecimal;

public class Item {

    private String codigo;
    private String nombre;
    private Integer cantidadComprada;
    private BigDecimal costoUnitario;

    public Item(String codigo, String nombre, Integer cantidadComprada, BigDecimal costoUnitario){
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidadComprada = cantidadComprada;
        this.costoUnitario = costoUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    } 

    public Integer getCantidadComprada() {
        return cantidadComprada;
    } 

    public BigDecimal getCostoUnitario() {
        return costoUnitario;
    }
}
