package pe.edu.upc.APPSI63.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.APPSI63.entities.EmpresaE;
import pe.edu.upc.APPSI63.entities.TipoProductoE;

@Repository
public interface TipoProductoRepository extends JpaRepository<TipoProductoE,Integer> {
}
