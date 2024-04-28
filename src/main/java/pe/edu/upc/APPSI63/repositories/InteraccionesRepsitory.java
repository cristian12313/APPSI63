package pe.edu.upc.APPSI63.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.APPSI63.entities.EmpresaE;
import pe.edu.upc.APPSI63.entities.InteraccionesE;

@Repository
public interface InteraccionesRepsitory extends JpaRepository<InteraccionesE,Integer> {
}
