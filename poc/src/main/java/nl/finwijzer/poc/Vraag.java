package nl.finwijzer.poc;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
@Entity
public class Vraag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tekst;

    private int volgorde;
    @OneToMany(mappedBy = "vraag")
    private List<Antwoordoptie> opties;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTekst() {
        return tekst;
    }

    public int getVolgorde() {
        return volgorde;
    }

    public void setVolgorde(int volgorde) {
        this.volgorde = volgorde;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public List<Antwoordoptie> getOpties() {
        return opties;
    }

    public void setOpties(List<Antwoordoptie> opties) {
        this.opties = opties;
    }
}