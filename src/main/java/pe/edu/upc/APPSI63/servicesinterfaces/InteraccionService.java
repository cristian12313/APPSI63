package pe.edu.upc.APPSI63.servicesinterfaces;

import pe.edu.upc.APPSI63.entities.EmpresaE;
import pe.edu.upc.APPSI63.entities.InteraccionesE;

public interface InteraccionService {
    public void insert(InteraccionesE interaccionesE);
    public void delete(int id);
}
