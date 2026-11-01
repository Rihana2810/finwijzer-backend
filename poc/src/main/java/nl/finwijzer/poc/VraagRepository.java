package nl.finwijzer.poc;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface VraagRepository extends JpaRepository<Vraag, Long> {

    List<Vraag> findTop10ByOrderByVolgordeAsc();
}