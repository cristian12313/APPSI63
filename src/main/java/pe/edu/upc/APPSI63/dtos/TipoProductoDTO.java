package pe.edu.upc.APPSI63.dtos;

public class TipoProductoDTO {
    private int idTProducto;
    private  String nombreTipo;
    private  String Descripcion;

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
