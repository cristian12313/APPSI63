package pe.edu.upc.APPSI63.servicesinterfaces;

import pe.edu.upc.APPSI63.entities.Diseño;

import java.util.List;

public interface DiseñoService {
    public void insert(Diseño diseño);
    public List<Diseño> list();
    public void delete(int id);
    public Diseño listId(int id);
}
