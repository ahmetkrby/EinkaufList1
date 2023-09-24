import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/einkaufList")
public class EinkauftListREST {
    @Autowired
    EinkaufListService einkaufListService;

    @PostMapping("/createEinkaufList")
    public EinkaufList createEinkaufList() {
        return einkaufListService.createEinkaufList();
    }



    @PostMapping("/addProduktEinkaufList")
    public void addProduktEinkaufList(@RequestParam("einkaufListId") Long einkaufListId, @RequestParam("produktId") Long produktId) throws Exception {
        einkaufListService.addProduktEinkaufList(einkaufListId, produktId );
    }

    @PostMapping("/removeProduktEinkaufList")
    public void removeProduktEinkaufList(@RequestParam("einkaufListId") Long einkaufListId, @RequestParam("produktId") Long produktId) throws Exception {
        einkaufListService.removeProduktEinkaufList(einkaufListId, produktId );
    }
}
