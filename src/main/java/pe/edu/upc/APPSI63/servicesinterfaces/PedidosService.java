package pe.edu.upc.APPSI63.servicesinterfaces;

import pe.edu.upc.APPSI63.entities.PedidosE;

import java.util.List;

public interface PedidosService {

    public void insert(PedidosE pedidosE);
    public List<PedidosE> list();
    public void delete(int id);
    public List<String[]> quantityPedidos();
}
