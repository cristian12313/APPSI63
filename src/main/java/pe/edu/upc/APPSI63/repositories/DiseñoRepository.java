package pe.edu.upc.APPSI63.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.APPSI63.entities.Diseño;
@Repository
public interface DiseñoRepository extends JpaRepository<Diseño,Integer> {
}
