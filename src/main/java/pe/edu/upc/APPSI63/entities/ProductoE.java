package pe.edu.upc.APPSI63.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Producto")
public class ProductoE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idProducto;
    @Column(name = "nombreProducto",nullable = false,length = 35)
    private  String nombreProducto;
    @Column(name = "tallaProducto",nullable = false,length = 25)
    private String tallaProducto;
    @Column(name = "colorProducto",nullable = false,length = 25)
    private String colorProducto;
    @Column(name = "Confeccion",nullable = false,length = 15)
    private String Confeccion;

    public ProductoE() {
    }

    public ProductoE(int idProducto, String nombreProducto, String tallaProducto, String colorProducto, String confeccion) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.tallaProducto = tallaProducto;
        this.colorProducto = colorProducto;
        Confeccion = confeccion;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTallaProducto() {
        return tallaProducto;
    }

    public void setTallaProducto(String tallaProducto) {
        this.tallaProducto = tallaProducto;
    }

    public String getColorProducto() {
        return colorProducto;
    }

    public void setColorProducto(String colorProducto) {
        this.colorProducto = colorProducto;
    }

    public String getConfeccion() {
        return Confeccion;
    }

    public void setConfeccion(String confeccion) {
        Confeccion = confeccion;
    }
}
