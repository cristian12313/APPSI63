package pe.edu.upc.APPSI63.dtos;



import java.time.LocalDate;

public class DiseñoDTO {
    private int idDiseño;
    private  String nombreDiseño;
    private String tallaDiseño;
    private String PrendaDiseño;
    private String colorDiseño;
    private LocalDate Fecha;

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

    public void setPrendaDiseño(String prendaDiseño) {
        this.PrendaDiseño = prendaDiseño;
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

    public void setFecha(LocalDate fecha) {
        this.Fecha = fecha;
    }
}
