package pe.edu.upc.APPSI63.dtos;



import java.time.LocalDate;

public class DiseñoDTO {
    private int idProducto;
    private  String nombreProducto;
    private String tallaProducto;
    private String PrendaDiseño;
    private String color;
    private LocalDate Fecha;

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

    public String getPrendaDiseño() {
        return PrendaDiseño;
    }

    public void setPrendaDiseño(String prendaDiseño) {
        this.PrendaDiseño = prendaDiseño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.Fecha = fecha;
    }
}
