package pe.edu.upc.APPSI63.dtos;

import pe.edu.upc.APPSI63.entities.PedidosE;
import pe.edu.upc.APPSI63.entities.ProductoE;

import java.time.LocalDate;

public class DetallePedidoDTO {
    private int idDetallePago;
    private  String Descripcion;
    private  String Cantidad;
    private long Subtotal;
    private LocalDate Fecha;
        private ProductoE producto;
        private PedidosE pedidos;

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
