package pe.edu.upc.APPSI63.dtos;

import pe.edu.upc.APPSI63.entities.EmpresaE;
import pe.edu.upc.APPSI63.entities.UserE;

import java.time.LocalDate;

public class InteraccionesDTO {
    private int idInteraccion;
    private  String Contenido;
    private LocalDate Fecha;
    private UserE user;
    private EmpresaE empresa;

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

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }

    public UserE getUser() {
        return user;
    }

    public void setUser(UserE user) {
        this.user = user;
    }

    public EmpresaE getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaE empresa) {
        this.empresa = empresa;
    }
}
