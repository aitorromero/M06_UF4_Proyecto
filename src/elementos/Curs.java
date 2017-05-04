package elementos;

import Utilitats.CursNom;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Curs implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    private CursNom cursNom;
    
    @ManyToOne
    @JoinColumn
    private Cicle cicle;
    @OneToMany(mappedBy="curs", cascade = CascadeType.ALL)  
    private List<UnitatFormativa> llistatUF;

    public Curs() {
    }

    public Curs( CursNom cursNom, Cicle cicle) {
        this.cursNom = cursNom;
        this.cicle= cicle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CursNom getCursNom() {
        return cursNom;
    }

    public void setCursNom(CursNom cursNom) {
        this.cursNom = cursNom;
    }

    public Cicle getCicle() {
        return cicle;
    }

    public void setCicle(Cicle cicle) {
        this.cicle = cicle;
    }

    public List<UnitatFormativa> getLlistatUF() {
        return llistatUF;
    }

    public void setLlistatUF(List<UnitatFormativa> llistatUF) {
        this.llistatUF = llistatUF;
    } 
  
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Curs other = (Curs) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
