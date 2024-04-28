package pe.edu.upc.APPSI63.servicesinterfaces;

import pe.edu.upc.APPSI63.entities.UserE;

import java.util.List;

public interface UserService {
    public void insert(UserE userE);
    public List<UserE> list();
    public void delete(int id);
    public UserE listId(int id);
    public List<String[]> quantityUser();
}