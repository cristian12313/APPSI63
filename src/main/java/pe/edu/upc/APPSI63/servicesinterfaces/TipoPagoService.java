package pe.edu.upc.APPSI63.servicesinterfaces;

import pe.edu.upc.APPSI63.entities.EmpresaE;
import pe.edu.upc.APPSI63.entities.TipoPagoE;

public interface TipoPagoService {
    public void insert(TipoPagoE tipoPagoE);
    public void delete(int id);
}
