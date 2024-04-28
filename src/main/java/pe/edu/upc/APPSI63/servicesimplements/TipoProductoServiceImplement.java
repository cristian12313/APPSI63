package pe.edu.upc.APPSI63.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.APPSI63.entities.ProductoE;
import pe.edu.upc.APPSI63.entities.TipoProductoE;
import pe.edu.upc.APPSI63.repositories.ProductoRepository;
import pe.edu.upc.APPSI63.repositories.TipoProductoRepository;
import pe.edu.upc.APPSI63.servicesinterfaces.TipoProductoService;

import java.util.List;
@Service
public class TipoProductoServiceImplement implements TipoProductoService {
    @Autowired
    private TipoProductoRepository sR;
    @Override
    public void insert(TipoProductoE tipoProductoE) {
        sR.save(tipoProductoE);
    }

    @Override
    public List<TipoProductoE> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }
}
