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
    @Column(name = "Fecha",nullable = false)
    private LocalDate Fecha;
    @ManyToOne
    @JoinColumn(name = "IdUser")
    private  UserE user;

    @ManyToOne
    @JoinColumn(name = "IdEmpresa")
    private  EmpresaE empresa;

    public InteraccionesE() {

    }

    public InteraccionesE(int idInteraccion, String contenido, LocalDate fecha, UserE user, EmpresaE empresa) {
        this.idInteraccion = idInteraccion;
        Contenido = contenido;
        Fecha = fecha;
        this.user = user;
        this.empresa = empresa;
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
