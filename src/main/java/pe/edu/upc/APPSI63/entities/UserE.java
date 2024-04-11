package pe.edu.upc.APPSI63.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")
public class UserE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column(name = "nombreUser",nullable = false,length = 35)
    private  String nombreUser;
    @Column(name = "dni")
    private long dni;
    @Column(name = "telefono")
    private long telefono;
    @Column(name = "contraseña",nullable = false,length = 35)
    private String contraseña;
    @Column(name = "Direccion",nullable = false,length = 35)
    private String Direccion;
    @Column(name = "Correo",nullable = false,length = 35)
    private String Correo;
    @Column(name = "Tipo_usuario",nullable = false,length = 35)
    private String Tipo_usuario;
    public UserE() {
    }
    public UserE(int idUser, String nombreUser, long dni, long telefono, String contraseña, String direccion, String correo, String tipo_usuario, Long id) {
        this.idUser = idUser;
        this.nombreUser = nombreUser;
        this.dni = dni;
        this.telefono = telefono;
        this.contraseña = contraseña;
        Direccion = direccion;
        Correo = correo;
        Tipo_usuario = tipo_usuario;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getTipo_usuario() {
        return Tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        Tipo_usuario = tipo_usuario;
    }
}
