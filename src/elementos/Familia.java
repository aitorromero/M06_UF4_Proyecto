package elementos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Familia implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    @OneToMany(mappedBy="familia")
    private List<Cicle> llistaCicles;

    public Familia(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Familia() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public List<Cicle> getLlistaCicles() {
        return llistaCicles;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLlistaCicles(List<Cicle> llistaCicles) {
        this.llistaCicles = llistaCicles;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final Familia other = (Familia) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }   
    
}
