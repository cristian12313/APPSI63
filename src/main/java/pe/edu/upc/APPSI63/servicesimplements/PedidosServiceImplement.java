package pe.edu.upc.APPSI63.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.APPSI63.entities.PedidosE;
import pe.edu.upc.APPSI63.repositories.PedidosRepository;
import pe.edu.upc.APPSI63.servicesinterfaces.PedidosService;

import java.util.List;
@Service
public class PedidosServiceImplement implements PedidosService {
    @Autowired
    private PedidosRepository sR;
    @Override
    public void insert(PedidosE pedidosE) {
        sR.save(pedidosE);
    }

    @Override
    public List<PedidosE> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }
    public List<String[]> quantityPedidos() {
        return sR.quantityPedidos();
    }

}
