package pe.edu.upc.APPSI63.dtos;

import java.time.LocalDate;

public class InteraccionesDTO {
    private int idInteraccion;
    private  String Contenido;
    private String TipoInteraccion;
    private LocalDate Fecha;

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
