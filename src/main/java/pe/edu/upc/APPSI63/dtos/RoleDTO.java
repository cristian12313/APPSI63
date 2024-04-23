package pe.edu.upc.APPSI63.dtos;

import pe.edu.upc.APPSI63.entities.UserE;

public class RoleDTO {
    private Long id;
    private String rol;
    private UserE user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public UserE getUser() {
        return user;
    }

    public void setUser(UserE user) {
        this.user = user;
    }
}
