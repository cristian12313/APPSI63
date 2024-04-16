package pe.edu.upc.APPSI63.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.APPSI63.entities.EmpresaE;
import pe.edu.upc.APPSI63.repositories.EmpresaRepository;
import pe.edu.upc.APPSI63.servicesinterfaces.EmpresaService;

import java.util.List;
@Service
public class EmpresaSeviceImplement implements EmpresaService {
    @Autowired
    private EmpresaRepository sR;
    @Override
    public void insert(EmpresaE shoe) {
        sR.save(shoe);
    }

    @Override
    public List<EmpresaE> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }

    @Override
    public EmpresaE listId(int id) {return sR.findById(id).orElse(new EmpresaE());
    }
}
