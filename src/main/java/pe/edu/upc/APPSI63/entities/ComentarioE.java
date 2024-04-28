package pe.edu.upc.APPSI63.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Comentario")
public class ComentarioE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentario;
    @Column(name = "Texto",nullable = false,length = 50)
    private  String Texto;
    @ManyToOne
    @JoinColumn(name = "IdUser")
    private  UserE user;

    public ComentarioE() {
    }

    public ComentarioE(int idComentario, String texto, UserE user) {
        this.idComentario = idComentario;
        Texto = texto;
        this.user = user;
    }

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
