package pe.edu.upc.APPSI63.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "DetallePago")
public class DetallePedidoE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetallePago;
    @Column(name = "Descripcion",nullable = false,length = 25)
    private  String Descripcion;
    @Column(name = "Cantidad",nullable = false,length = 25)
    private  String Cantidad;
    @Column(name = "Subtotal")
    private long Subtotal;
    @Column(name = "Fecha",nullable = false)
    private LocalDate Fecha;
    @ManyToOne
    @JoinColumn(name = "IdProducto")
    private  ProductoE producto;

    @ManyToOne
    @JoinColumn(name = "IdPedidos")
    private  PedidosE pedidos;

    public DetallePedidoE() {
    }

    public DetallePedidoE(int idDetallePago, String descripcion, String cantidad, long subtotal, LocalDate fecha, ProductoE producto, PedidosE pedidos) {
        this.idDetallePago = idDetallePago;
        Descripcion = descripcion;
        Cantidad = cantidad;
        Subtotal = subtotal;
        Fecha = fecha;
        this.producto = producto;
        this.pedidos = pedidos;
    }

    public int getIdDetallePago() {
        return idDetallePago;
    }

    public void setIdDetallePago(int idDetallePago) {
        this.idDetallePago = idDetallePago;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String cantidad) {
        Cantidad = cantidad;
    }

    public long getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(long subtotal) {
        Subtotal = subtotal;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }

    public ProductoE getProducto() {
        return producto;
    }

    public void setProducto(ProductoE producto) {
        this.producto = producto;
    }

    public PedidosE getPedidos() {
        return pedidos;
    }

    public void setPedidos(PedidosE pedidos) {
        this.pedidos = pedidos;
    }
}
