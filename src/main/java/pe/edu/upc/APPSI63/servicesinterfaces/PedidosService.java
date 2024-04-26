package pe.edu.upc.APPSI63.servicesinterfaces;

import pe.edu.upc.APPSI63.entities.ProductoE;

import java.util.List;

public interface PedidosService {
    public void insert(ProductoE productoE);
    public List<ProductoE> list();
    public void delete(int id);
}
