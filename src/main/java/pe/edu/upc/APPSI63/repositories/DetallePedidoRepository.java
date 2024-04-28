package pe.edu.upc.APPSI63.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.APPSI63.entities.DetallePedidoE;
import pe.edu.upc.APPSI63.entities.UserE;

import java.util.List;

@Repository
public interface DetallePedidoRepository extends JpaRepository<DetallePedidoE,Integer> {
//    //QUERY DE CANTIDAD DE PEDIDOS
//    @Query(value = "SELECT usuario.username, Count(detalle_pago.id_detalle_pago) AS CuentaDeid_detalle_pago\n" +
//            "FROM usuario INNER JOIN (pedidos INNER JOIN detalle_pago ON pedidos.id_pedidos = detalle_pago.id_pedidos) ON usuario.id_user = pedidos.Id_user\n" +
//            "GROUP BY usuario.username;",nativeQuery = true)
//    public List<String[]> quantityPedidos();
//
//    //QUERY DE CANTIDAD DE PEDIDOS
//    @Query(value = "SELECT Sum(detalle_pago.subtotal) AS SumaDesubtotal, Month(detalle_pago.fecha) AS Mes\n" +
//            "FROM detalle_pago\n" +
//            "GROUP BY Month(detalle_pago.fecha);\n",nativeQuery = true)
//    public List<String[]> quantityPedidos();

}
