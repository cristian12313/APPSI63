package pe.edu.upc.APPSI63.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Empresa")
public class EmpresaE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpresa;
    @Column(name = "nombreEmpresa",nullable = false,length = 35)
    private  String nombreEmpresa;
    @Column(name = "valoracion")
    private float valoracion;
    @Column(name = "Direccion",nullable = false,length = 35)
    private String Direccion;
    @ManyToOne
    @JoinColumn(name = "IdUser")
    private  UserE user;

    public EmpresaE() {
    }

    public EmpresaE(int idEmpresa, String nombreEmpresa, float valoracion, String direccion, UserE user) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.valoracion = valoracion;
        Direccion = direccion;
        this.user = user;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public UserE getUser() {
        return user;
    }

    public void setUser(UserE user) {
        this.user = user;
    }
}
