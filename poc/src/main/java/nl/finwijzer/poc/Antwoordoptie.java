package nl.finwijzer.poc;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Antwoordoptie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tekst;

    @ManyToOne
    @JoinColumn(name = "vraag_id")
    @JsonIgnore
    private Vraag vraag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public Vraag getVraag() {
        return vraag;
    }

    public void setVraag(Vraag vraag) {
        this.vraag = vraag;
    }
}