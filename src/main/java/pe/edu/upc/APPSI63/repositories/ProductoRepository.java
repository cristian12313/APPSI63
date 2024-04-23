package pe.edu.upc.APPSI63.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.APPSI63.entities.ProductoE;
@Repository
public interface ProductoRepository extends JpaRepository<ProductoE,Integer> {
}
