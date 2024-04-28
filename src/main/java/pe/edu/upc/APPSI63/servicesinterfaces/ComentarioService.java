package pe.edu.upc.APPSI63.servicesinterfaces;

import pe.edu.upc.APPSI63.entities.ComentarioE;
import pe.edu.upc.APPSI63.entities.EmpresaE;

import java.util.List;

public interface ComentarioService {
    public void insert(ComentarioE comentarioE);
    public void delete(int id);
}
