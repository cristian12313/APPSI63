package pe.edu.upc.APPSI63.servicesimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.APPSI63.entities.EmpresaE;
import pe.edu.upc.APPSI63.entities.TipoPagoE;
import pe.edu.upc.APPSI63.repositories.EmpresaRepository;
import pe.edu.upc.APPSI63.repositories.TipoPagoRepository;
import pe.edu.upc.APPSI63.servicesinterfaces.TipoPagoService;
@Service
public class TipoPagoServiceImplement implements TipoPagoService {
    @Autowired
    private TipoPagoRepository sR;
    @Override
    public void insert(TipoPagoE tipoPagoE) {
        sR.save(tipoPagoE);
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }
}
