package pe.edu.upc.APPSI63.dtos;

import java.time.LocalDate;

public class DetallePedidoDTO {
    private int idDetallePago;
    private  String Descripcion;
    private  String Cantidad;
    private long Subtotal;
    private LocalDate Fecha;

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
}
