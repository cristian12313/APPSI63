package pe.edu.upc.APPSI63.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.APPSI63.entities.ProductoE;
import pe.edu.upc.APPSI63.repositories.ProductoRepository;
import pe.edu.upc.APPSI63.servicesinterfaces.TipoProductoService;

import java.util.List;
@Service
public class TipoProductoServiceImplement implements TipoProductoService {
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
