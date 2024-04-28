package pe.edu.upc.APPSI63.dtos;


import pe.edu.upc.APPSI63.entities.TipoProductoE;

import java.time.LocalDate;

public class ProductoDTO {
    private int idProducto;
    private  String nombreProducto;
    private String tallaProducto;
    private String colorProducto;
    private String Confeccion;
    private TipoProductoE tipoproducto;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTallaProducto() {
        return tallaProducto;
    }

    public void setTallaProducto(String tallaProducto) {
        this.tallaProducto = tallaProducto;
    }

    public String getColorProducto() {
        return colorProducto;
    }

    public void setColorProducto(String colorProducto) {
        this.colorProducto = colorProducto;
    }

    public String getConfeccion() {
        return Confeccion;
    }

    public void setConfeccion(String confeccion) {
        Confeccion = confeccion;
    }

    public TipoProductoE getTipoproducto() {
        return tipoproducto;
    }

    public void setTipoproducto(TipoProductoE tipoproducto) {
        this.tipoproducto = tipoproducto;
    }
}
