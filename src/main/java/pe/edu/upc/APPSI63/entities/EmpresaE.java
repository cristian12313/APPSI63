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
    public EmpresaE() {
    }
    public EmpresaE(int idEmpresa, String nombreEmpresa, float valoracion, String direccion) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.valoracion = valoracion;
        Direccion = direccion;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idUser) {
        this.idEmpresa = idUser;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreUser) {
        this.nombreEmpresa = nombreUser;
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
}
