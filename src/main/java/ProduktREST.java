import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produkts")
public class ProduktREST {
    @Autowired
    ProductService productService;

    @GetMapping("/getAllProdukts")
    public ResponseEntity<List<Produkt>> getAllProdukts() {
        return new ResponseEntity<>(productService.getProdukts(), HttpStatus.OK);
    }

    @PostMapping("/addProdukt")
    public ResponseEntity<Produkt> addProdukt(@RequestBody Produkt produkt) {
        return new ResponseEntity<>( productService.addProdukt(produkt), HttpStatus.OK);
    }

    @PostMapping("/deleteProdukt")
    public void deleteProdukt(@RequestParam("id") Long id) {
         productService.deleteProdukt(id);
    }

    @GetMapping("/findProduktByCategory")
    public ResponseEntity<List<Produkt>> findProduktByCategory(@RequestParam("category") String category) {
          return new ResponseEntity<>(productService.getProduktsByCategory(category), HttpStatus.OK);
    }
}
