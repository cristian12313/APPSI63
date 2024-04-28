package pe.edu.upc.APPSI63.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.APPSI63.entities.UserE;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserE,Integer> {
    public UserE findByUsername(String username);

    //BUSCAR POR NOMBRE
    @Query("select count(u.username) from UserE u where u.username =:username")
    public int buscarUsername(@Param("username") String nombre);


    //INSERTAR ROLES
    @Transactional
    @Modifying
    @Query(value = "insert into roles (rol, user_id) VALUES (:rol, :user_id)", nativeQuery = true)
    public void insRol(@Param("rol") String authority, @Param("user_id") Long user_id);

    //Query cantidad usuarios
    @Query(value = "SELECT username, COUNT(*) AS \"Cantidad de Usuarios Registrados\" \n" +
            "FROM usuario \n" +
            "GROUP BY username; \n",nativeQuery = true)
    public List<String[]> quantityUser();
}
