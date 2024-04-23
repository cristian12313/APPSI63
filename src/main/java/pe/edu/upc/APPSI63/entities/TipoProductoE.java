package pe.edu.upc.APPSI63.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "TipoProducto")
public class TipoProductoE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTProducto;
    @Column(name = "Descripcion",nullable = false,length = 35)
    private  String Descripcion;
    @Column(name = "Diseños",nullable = false,length = 35)
    private String Diseños;
    @Column(name = "ConfeccionePrendas",nullable = false,length = 25)
    private String ConfeccionePrendas;
    public TipoProductoE() {
    }

    public TipoProductoE(int idTProducto, String descripcion, String diseños, String confeccionePrendas) {
        this.idTProducto = idTProducto;
        Descripcion = descripcion;
        Diseños = diseños;
        ConfeccionePrendas = confeccionePrendas;
    }

    public int getIdTProducto() {
        return idTProducto;
    }

    public void setIdTProducto(int idTProducto) {
        this.idTProducto = idTProducto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getDiseños() {
        return Diseños;
    }

    public void setDiseños(String diseños) {
        Diseños = diseños;
    }

    public String getConfeccionePrendas() {
        return ConfeccionePrendas;
    }

    public void setConfeccionePrendas(String confeccionePrendas) {
        ConfeccionePrendas = confeccionePrendas;
    }
}
