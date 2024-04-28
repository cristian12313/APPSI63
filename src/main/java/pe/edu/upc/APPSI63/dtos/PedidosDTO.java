package pe.edu.upc.APPSI63.dtos;

import pe.edu.upc.APPSI63.entities.TipoPagoE;
import pe.edu.upc.APPSI63.entities.UserE;

public class PedidosDTO {
    private int idPedidos;
    private String nombrePedido;
    private  String Estado;
    private String Total;
    private UserE user;
    private TipoPagoE tipopago;
    private int quantityPedidos;

    public int getIdPedidos() {
        return idPedidos;
    }

    public void setIdPedidos(int idPedidos) {
        this.idPedidos = idPedidos;
    }

    public String getNombrePedido() {
        return nombrePedido;
    }

    public void setNombrePedido(String nombrePedido) {
        this.nombrePedido = nombrePedido;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        Total = total;
    }

    public int getQuantityPedidos() {
        return quantityPedidos;
    }

    public void setQuantityPedidos(int quantityPedidos) {
        this.quantityPedidos = quantityPedidos;
    }
    public UserE getUser() {
        return user;
    }

    public void setUser(UserE user) {
        this.user = user;
    }

    public TipoPagoE getTipopago() {
        return tipopago;
    }

    public void setTipopago(TipoPagoE tipopago) {
        this.tipopago = tipopago;
    }
}
