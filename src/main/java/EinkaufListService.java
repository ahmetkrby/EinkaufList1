import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EinkaufListService {

    @Autowired
    EinkaufListDAO einkaufListDAO;
    @Autowired
    ProductDAO productDAO;


    public EinkaufList createEinkaufList() {
        EinkaufList einkaufList = new EinkaufList();
       einkaufList = einkaufListDAO.save(einkaufList);
       return einkaufList;
    }

    public void addProduktEinkaufList(Long einkaufListId, Long produktId) throws Exception {

        EinkaufList einkaufList = null;
        einkaufListDAO.findById(einkaufListId);
        Produkt produkt = null;
        productDAO.findById(produktId);

        List<Produkt> produkts = einkaufList.getProdukts();

        if (einkaufList != null && produkt != null) {
            produkts.add(produkt);
        } else {
            throw new Exception("Einkauflist or Produkt null!");
        }
        einkaufListDAO.save(einkaufList);
    }

    public void removeProduktEinkaufList(Long einkaufListId, Long produktId) throws Exception {

        EinkaufList einkaufList = null;
        einkaufListDAO.findById(einkaufListId);
        Produkt produkt = null;
        productDAO.findById(produktId);

        List<Produkt> produkts = einkaufList.getProdukts();

        if (einkaufList != null && produkt != null) {
            produkts.remove(produkt);
        } else {
            throw new Exception("Einkauflist or Produkt null!");
        }
        einkaufListDAO.save(einkaufList);
    }

}
