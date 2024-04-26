package pe.edu.upc.APPSI63.dtos;

import java.time.LocalDate;

public class TipoPagoDTO {
    private int idTPago;
    private  String NombreTPago;

    public int getIdTPago() {
        return idTPago;
    }

    public void setIdTPago(int idTPago) {
        this.idTPago = idTPago;
    }

    public String getNombreTPago() {
        return NombreTPago;
    }

    public void setNombreTPago(String nombreTPago) {
        NombreTPago = nombreTPago;
    }
}
