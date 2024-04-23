package pe.edu.upc.APPSI63.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Interacciones")
public class InteraccionesE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInteraccion;
    @Column(name = "Contenido",nullable = false,length = 35)
    private  String Contenido;
    @Column(name = "TipoInteraccion",nullable = false,length = 35)
    private String TipoInteraccion;
    @Column(name = "Fecha",nullable = false)
    private LocalDate Fecha;

    public InteraccionesE(int idInteraccion, String contenido, String tipoInteraccion, LocalDate fecha) {
        this.idInteraccion = idInteraccion;
        Contenido = contenido;
        TipoInteraccion = tipoInteraccion;
        Fecha = fecha;
    }

    public int getIdInteraccion() {
        return idInteraccion;
    }

    public void setIdInteraccion(int idInteraccion) {
        this.idInteraccion = idInteraccion;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String contenido) {
        Contenido = contenido;
    }

    public String getTipoInteraccion() {
        return TipoInteraccion;
    }

    public void setTipoInteraccion(String tipoInteraccion) {
        TipoInteraccion = tipoInteraccion;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }
}
