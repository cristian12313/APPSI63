package pe.edu.upc.APPSI63.dtos;

public class TipoProductoDTO {
    private int idTProducto;
    private  String Descripcion;
    private String Diseños;
    private String ConfeccionePrendas;

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
