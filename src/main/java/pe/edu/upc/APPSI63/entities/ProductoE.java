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
    private  String nombreDiseño;
    @Column(name = "talla",nullable = false)
    private String tallaProducto;
    @Column(name = "PrendaDiseño",nullable = false,length = 25)
    private String PrendaDiseño;
    @Column(name = "color",nullable = false,length = 15)
    private String color;
    @Column(name = "Fecha",nullable = false)
    private LocalDate Fecha;

    public ProductoE() {
    }

    public ProductoE(int idProducto, String nombreDiseño, String tallaProducto, String PrendaDiseño, String color, LocalDate Fecha) {
        this.idProducto = idProducto;
        this.nombreDiseño = nombreDiseño;
        this.tallaProducto = tallaProducto;
        this.PrendaDiseño = PrendaDiseño;
        this.color = color;
        this.Fecha = Fecha;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreDiseño() {
        return nombreDiseño;
    }

    public void setNombreDiseño(String nombreDiseño) {
        this.nombreDiseño = nombreDiseño;
    }

    public String getTallaProducto() {
        return tallaProducto;
    }

    public void setTallaProducto(String tallaProducto) {
        this.tallaProducto = tallaProducto;
    }

    public String getPrendaDiseño() {
        return PrendaDiseño;
    }

    public void setPrendaDiseño(String PrendaDiseño) {
        this.PrendaDiseño = PrendaDiseño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String colorDiseño) {
        this.color = colorDiseño;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }
}
