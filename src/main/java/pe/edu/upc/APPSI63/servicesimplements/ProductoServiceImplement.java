package pe.edu.upc.APPSI63.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.APPSI63.entities.ProductoE;
import pe.edu.upc.APPSI63.repositories.ProductoRepository;
import pe.edu.upc.APPSI63.servicesinterfaces.ProductoService;

import java.util.List;
@Service
public class ProductoServiceImplement implements ProductoService {
    @Autowired
    private ProductoRepository sR;
    @Override
    public void insert(ProductoE productoE) {
        sR.save(productoE);
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










