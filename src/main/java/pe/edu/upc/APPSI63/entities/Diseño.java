package pe.edu.upc.APPSI63.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Producto")
public class Diseño {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idDiseño;
    @Column(name = "nombreProducto",nullable = false,length = 35)
    private  String nombreDiseño;
    @Column(name = "talla",nullable = false)
    private String tallaDiseño;
    @Column(name = "PrendaDiseño",nullable = false,length = 25)
    private String PrendaDiseño;
    @Column(name = "color",nullable = false,length = 15)
    private String colorDiseño;
    @Column(name = "Fecha",nullable = false)
    private LocalDate Fecha;

    public Diseño() {
    }

    public Diseño(int idDiseño, String nombreDiseño, String tallaDiseño, String PrendaDiseño, String colorDiseño, LocalDate Fecha) {
        this.idDiseño = idDiseño;
        this.nombreDiseño = nombreDiseño;
        this.tallaDiseño = tallaDiseño;
        this.PrendaDiseño = PrendaDiseño;
        this.colorDiseño = colorDiseño;
        this.Fecha = Fecha;
    }

    public int getIdDiseño() {
        return idDiseño;
    }

    public void setIdDiseño(int idDiseño) {
        this.idDiseño = idDiseño;
    }

    public String getNombreDiseño() {
        return nombreDiseño;
    }

    public void setNombreDiseño(String nombreDiseño) {
        this.nombreDiseño = nombreDiseño;
    }

    public String getTallaDiseño() {
        return tallaDiseño;
    }

    public void setTallaDiseño(String tallaDiseño) {
        this.tallaDiseño = tallaDiseño;
    }

    public String getPrendaDiseño() {
        return PrendaDiseño;
    }

    public void setPrendaDiseño(String PrendaDiseño) {
        this.PrendaDiseño = PrendaDiseño;
    }

    public String getColorDiseño() {
        return colorDiseño;
    }

    public void setColorDiseño(String colorDiseño) {
        this.colorDiseño = colorDiseño;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }
}
