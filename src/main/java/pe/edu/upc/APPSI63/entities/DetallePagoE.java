package pe.edu.upc.APPSI63.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "DetallePago")
public class DetallePagoE {
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
    public DetallePagoE() {
    }

    public DetallePagoE(int idDetallePago, String descripcion, String cantidad, long subtotal, LocalDate fecha) {
        this.idDetallePago = idDetallePago;
        Descripcion = descripcion;
        Cantidad = cantidad;
        Subtotal = subtotal;
        Fecha = fecha;
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
}
