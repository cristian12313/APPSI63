package pe.edu.upc.APPSI63.servicesinterfaces;

import pe.edu.upc.APPSI63.entities.ProductoE;
import pe.edu.upc.APPSI63.entities.TipoProductoE;

import java.util.List;

public interface TipoProductoService {
    public void insert(TipoProductoE tipoProductoE);
    public List<TipoProductoE> list();
    public void delete(int id);
}
