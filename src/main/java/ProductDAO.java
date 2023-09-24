import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDAO extends JpaRepository<Produkt, Long> {
    List<Produkt> findProduktByCategory(String category);
}
