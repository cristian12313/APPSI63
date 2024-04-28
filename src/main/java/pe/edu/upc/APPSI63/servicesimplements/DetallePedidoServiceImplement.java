package pe.edu.upc.APPSI63.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.APPSI63.entities.DetallePedidoE;
import pe.edu.upc.APPSI63.entities.ProductoE;
import pe.edu.upc.APPSI63.repositories.DetallePedidoRepository;
import pe.edu.upc.APPSI63.repositories.ProductoRepository;
import pe.edu.upc.APPSI63.servicesinterfaces.DetallePedidoService;

import java.util.List;
@Service
public class DetallePedidoServiceImplement implements DetallePedidoService {
    @Autowired
    private DetallePedidoRepository sR;
    @Override
    public void insert(DetallePedidoE detallePedidoE) {
        sR.save(detallePedidoE);
    }

    @Override
    public List<DetallePedidoE> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }
}
