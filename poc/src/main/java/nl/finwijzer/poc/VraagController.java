package nl.finwijzer.poc;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class VraagController {

    private final VraagRepository vragen;

    public VraagController(VraagRepository vragen) {
        this.vragen = vragen;
    }

    @GetMapping("/vragen")
    public List<Vraag> alle() {
        return vragen.findTop10ByOrderByVolgordeAsc();
    }
}