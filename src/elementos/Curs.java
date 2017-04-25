package elementos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curs implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomCurs;
    private List<UnitatFormativa> llistatUF;

    public Curs() {
    }

    public Curs(Long id, String nomCurs, List<UnitatFormativa> llistatUF) {
        this.id = id;
        this.nomCurs = nomCurs;
        this.llistatUF = llistatUF;
    }

    public void setNomCurs(String nomCurs) {
        this.nomCurs = nomCurs;
    }

    public void setLlistatUF(List<UnitatFormativa> llistatUF) {
        this.llistatUF = llistatUF;
    }

    public String getNomCurs() {
        return nomCurs;
    }

    public List<UnitatFormativa> getLlistatUF() {
        return llistatUF;
    }    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
