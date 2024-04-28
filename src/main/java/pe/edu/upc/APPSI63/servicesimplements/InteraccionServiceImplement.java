package pe.edu.upc.APPSI63.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.APPSI63.entities.EmpresaE;
import pe.edu.upc.APPSI63.entities.InteraccionesE;
import pe.edu.upc.APPSI63.repositories.EmpresaRepository;
import pe.edu.upc.APPSI63.repositories.InteraccionesRepsitory;
import pe.edu.upc.APPSI63.servicesinterfaces.InteraccionService;

@Service
public class InteraccionServiceImplement implements InteraccionService {
    @Autowired
    private InteraccionesRepsitory sR;
    @Override
    public void insert(InteraccionesE interaccionesE) {
        sR.save(interaccionesE);
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }
}
