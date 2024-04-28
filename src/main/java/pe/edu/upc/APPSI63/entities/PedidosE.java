package pe.edu.upc.APPSI63.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Pedidos")
public class PedidosE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedidos;
    @Column(name = "nombrePedido",nullable = false,length = 35)
    private  String nombrePedido;
    @Column(name = "Estado",nullable = false,length = 35)
    private  String Estado;
    @Column(name = "Total",nullable = false,length = 35)
    private String Total;
    @ManyToOne
    @JoinColumn(name = "IdUser")
    private  UserE user;
    @ManyToOne
    @JoinColumn(name = "IdTipoPago")
    private  TipoPagoE tipopago;

    public PedidosE() {
    }

    public PedidosE(int idPedidos, String nombrePedido, String estado, String total, UserE user, TipoPagoE tipopago) {
        this.idPedidos = idPedidos;
        this.nombrePedido = nombrePedido;
        Estado = estado;
        Total = total;
        this.user = user;
        this.tipopago = tipopago;
    }

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
