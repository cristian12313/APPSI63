package pe.edu.upc.APPSI63.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Pedidos")
public class PedidosE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedidos;
    @Column(name = "nombreProducto",nullable = false,length = 35)
    private  String nombreProducto;
    @Column(name = "Estado",nullable = false,length = 35)
    private  String Estado;
    @Column(name = "Total",nullable = false,length = 35)
    private String Total;
    public PedidosE() {
    }

    public PedidosE(int idPedidos, String nombreProducto, String estado, String total) {
        this.idPedidos = idPedidos;
        this.nombreProducto = nombreProducto;
        Estado = estado;
        Total = total;
    }

    public int getIdPedidos() {
        return idPedidos;
    }

    public void setIdPedidos(int idPedidos) {
        this.idPedidos = idPedidos;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
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
}
