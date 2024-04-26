package pe.edu.upc.APPSI63.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.APPSI63.entities.ProductoE;
import pe.edu.upc.APPSI63.repositories.ProductoRepository;
import pe.edu.upc.APPSI63.servicesinterfaces.DetallePedidoService;

import java.util.List;
@Service
public class DetallePedidoServiceImplement implements DetallePedidoService {
    @Autowired
    private ProductoRepository sR;
    @Override
    public void insert(ProductoE shoe) {
        sR.save(shoe);
    }

    @Override
    public List<ProductoE> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }
}
