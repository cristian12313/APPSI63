package pe.edu.upc.APPSI63.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.APPSI63.entities.EmpresaE;
import pe.edu.upc.APPSI63.entities.TipoProductoE;

import java.util.List;

@Repository
public interface TipoProductoRepository extends JpaRepository<TipoProductoE,Integer> {
//    //QUERY DE CANTIDAD DE PEDIDOS
//    @Query(value = "SELECT tipo_pago.nombretpago, Count(pedidos.id_tipo_pago) AS CuentaDeid_tipo_pago\n" +
//            "FROM tipo_pago INNER JOIN pedidos ON tipo_pago.idtpago = pedidos.id_tipo_pago\n" +
//            "GROUP BY tipo_pago.nombretpago;",nativeQuery = true)
//    public List<String[]> quantityPedidos();

}
