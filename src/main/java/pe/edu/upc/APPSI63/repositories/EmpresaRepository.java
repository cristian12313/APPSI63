package pe.edu.upc.APPSI63.repositories;
import pe.edu.upc.APPSI63.entities.EmpresaE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<EmpresaE,Integer> {
}
