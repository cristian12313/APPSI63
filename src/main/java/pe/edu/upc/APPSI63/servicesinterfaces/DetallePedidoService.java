package pe.edu.upc.APPSI63.servicesinterfaces;

import pe.edu.upc.APPSI63.entities.DetallePedidoE;
import pe.edu.upc.APPSI63.entities.ProductoE;

import java.util.List;

public interface DetallePedidoService {
    public void insert(DetallePedidoE detallePedidoE);
    public List<DetallePedidoE> list();
    public void delete(int id);
}
