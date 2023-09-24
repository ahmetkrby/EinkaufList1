import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.*;

import javax.persistence.*;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class EinkaufList {

    @Id
    private Long id;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Produkt> produkts =new ArrayList<>();


}
