package pe.edu.upc.APPSI63.dtos;

public class EmpresaDTO {
    private int idEmpresa;
    private  String nombreEmpresa;
    private float valoracion;
    private String Direccion;

    public int getIdUser() {
        return idEmpresa;
    }

    public void setIdUser(int idEmpresa) {
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

    public void setValoracion(long valoracion) {
        this.valoracion = valoracion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
}
