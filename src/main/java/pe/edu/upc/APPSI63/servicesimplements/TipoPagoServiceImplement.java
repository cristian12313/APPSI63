package pe.edu.upc.APPSI63.servicesimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.APPSI63.entities.EmpresaE;
import pe.edu.upc.APPSI63.repositories.EmpresaRepository;
import pe.edu.upc.APPSI63.servicesinterfaces.TipoPagoService;
@Service
public class TipoPagoServiceImplement implements TipoPagoService {
    @Autowired
    private EmpresaRepository sR;
    @Override
    public void insert(EmpresaE shoe) {
        sR.save(shoe);
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }
}
