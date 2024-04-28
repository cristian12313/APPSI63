package pe.edu.upc.APPSI63.dtos;

import pe.edu.upc.APPSI63.entities.UserE;

import java.time.LocalDate;

public class ComentarioDTO {
    private int idComentario;
    private  String Texto;
    private UserE user;

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

    public UserE getUser() {
        return user;
    }

    public void setUser(UserE user) {
        this.user = user;
    }
}
