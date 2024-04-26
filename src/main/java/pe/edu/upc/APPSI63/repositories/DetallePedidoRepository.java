package pe.edu.upc.APPSI63.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.APPSI63.entities.UserE;

public interface DetallePedidoRepository extends JpaRepository<UserE,Integer> {
}
