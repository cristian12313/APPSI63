package pe.edu.upc.APPSI63.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.APPSI63.entities.Diseño;
import pe.edu.upc.APPSI63.repositories.DiseñoRepository;
import pe.edu.upc.APPSI63.servicesinterfaces.DiseñoService;

import java.util.List;
@Service
public class DiseñoServiceImplement implements DiseñoService {
    @Autowired
    private DiseñoRepository sR;
    @Override
    public void insert(Diseño shoe) {
        sR.save(shoe);
    }

    @Override
    public List<Diseño> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }

    @Override
    public Diseño listId(int id) {
        return sR.findById(id).orElse(new Diseño());
    }
}










