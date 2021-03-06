package elementos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({
@NamedQuery(name= Familia.FAMILIA_ID, query="SELECT f FROM Familia f WHERE f.id=:id")})
public class Familia implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    public static final String FAMILIA_ID = "familia_id";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    
    @OneToMany(mappedBy="familia", cascade = CascadeType.PERSIST)
    private List<Cicle> llistaCicles;

    public Familia( String nom) {
       
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
