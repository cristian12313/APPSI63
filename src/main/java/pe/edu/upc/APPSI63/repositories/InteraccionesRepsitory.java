package pe.edu.upc.APPSI63.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.APPSI63.entities.EmpresaE;
import pe.edu.upc.APPSI63.entities.InteraccionesE;

import java.util.List;

@Repository
public interface InteraccionesRepsitory extends JpaRepository<InteraccionesE,Integer> {
//    //QUERY DE CANTIDAD DE PEDIDOS
//    @Query(value = "SELECT usuario.username, interacciones.id_empresa, interacciones.fecha\n" +
//            "FROM usuario INNER JOIN interacciones ON usuario.id_user = interacciones.id_user\n" +
//            "GROUP BY usuario.username, interacciones.id_empresa, interacciones.fecha;",nativeQuery = true)
//    public List<String[]> quantityPedidos();
}
