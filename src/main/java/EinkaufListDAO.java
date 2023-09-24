import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EinkaufListDAO extends JpaRepository<EinkaufList, Long> {
}
