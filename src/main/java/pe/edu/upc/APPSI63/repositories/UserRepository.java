package pe.edu.upc.APPSI63.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.APPSI63.entities.UserE;

@Repository
public interface UserRepository extends JpaRepository<UserE,Integer> {
}
