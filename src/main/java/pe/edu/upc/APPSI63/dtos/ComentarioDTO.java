package pe.edu.upc.APPSI63.dtos;

import java.time.LocalDate;

public class ComentarioDTO {
    private int idComentario;
    private  String Texto;

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String texto) {
        Texto = texto;
    }
}
