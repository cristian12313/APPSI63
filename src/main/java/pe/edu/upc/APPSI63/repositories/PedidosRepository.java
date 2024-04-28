package pe.edu.upc.APPSI63.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.APPSI63.entities.EmpresaE;
import pe.edu.upc.APPSI63.entities.PedidosE;

import java.util.List;

@Repository
public interface PedidosRepository extends JpaRepository<PedidosE,Integer> {
    //QUERY DE CANTIDAD DE PEDIDOS
    @Query(value = "SELECT u.username, COUNT(p.id_pedidos) AS \"Cantidad de Pedidos\" \n" +
            "FROM usuario u \n" +
            "JOIN pedidos p ON u.id_user = p.id_user \n" +
            "GROUP BY u.username; ",nativeQuery = true)
    public List<String[]> quantityPedidos();
}
