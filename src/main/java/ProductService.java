import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductDAO productDAO;


    public List<Produkt> getProdukts() {
        return productDAO.findAll();
    }

    public Produkt addProdukt(Produkt produkt) {
        return productDAO.save(produkt);
    }

    public void deleteProdukt(Long produktId) {
        productDAO.deleteById(produktId);
    }

   /* public void deleteProdukt(Produkt produkt) {
        productRepository.delete(produkt);
    } */

    public List<Produkt> getProduktsByCategory(String category) {
        return productDAO.findProduktByCategory(category);
    }
}


