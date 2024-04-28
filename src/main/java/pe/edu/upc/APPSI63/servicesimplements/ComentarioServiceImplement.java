package pe.edu.upc.APPSI63.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.APPSI63.entities.ComentarioE;
import pe.edu.upc.APPSI63.entities.EmpresaE;
import pe.edu.upc.APPSI63.repositories.ComentarioRepository;
import pe.edu.upc.APPSI63.repositories.EmpresaRepository;
import pe.edu.upc.APPSI63.servicesinterfaces.ComentarioService;

import java.util.List;
@Service
public class ComentarioServiceImplement implements ComentarioService {
    @Autowired
    private ComentarioRepository sR;
    @Override
    public void insert(ComentarioE comentarioE) {
        sR.save(comentarioE);
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }
}
