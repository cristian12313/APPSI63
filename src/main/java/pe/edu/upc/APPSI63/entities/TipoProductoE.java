package pe.edu.upc.APPSI63.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "TipoProducto")
public class TipoProductoE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTProducto;
    @Column(name = "nombreTipo",nullable = false,length = 35)
    private  String nombreTipo;
    @Column(name = "Descripcion",nullable = false,length = 35)
    private String Descripcion;
    public TipoProductoE() {
    }

    public TipoProductoE(int idTProducto, String nombreTipo, String descripcion) {
        this.idTProducto = idTProducto;
        this.nombreTipo = nombreTipo;
        Descripcion = descripcion;
    }

    public int getIdTProducto() {
        return idTProducto;
    }

    public void setIdTProducto(int idTProducto) {
        this.idTProducto = idTProducto;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
