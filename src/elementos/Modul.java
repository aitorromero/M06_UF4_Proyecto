package elementos;

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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({
@NamedQuery(name= Modul.MODUL_ID, query="SELECT m FROM Modul m WHERE m.id=:id")})
public class Modul implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    public static final String MODUL_ID = "modul_id";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;  
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idCurs")
    private Curs curs;
    
    @ManyToOne (cascade = CascadeType.PERSIST)
    @JoinColumn
    private Cicle cicle;
    
    @OneToMany(mappedBy="modul",cascade = CascadeType.ALL)    
    private List<UnitatFormativa> llistaUF;

    public Modul() {
    }

    public Modul(String nom, Curs curs,Cicle cicle) {
        
        this.nom = nom;
        this.cicle=cicle;
        this.curs = curs;
    }

    public Modul(String nom) {
        this.nom = nom;
    }
    
    

    public Curs getCurs() {
        return curs;
    }

    public void setCurs(Curs curs) {
        this.curs = curs;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Cicle getCicle() {
        return cicle;
    }

    public void setCicle(Cicle cicle) {
        this.cicle = cicle;
    }

    public List<UnitatFormativa> getLlistaUF() {
        return llistaUF;
    }

    public void setLlistaUF(List<UnitatFormativa> llistaUF) {
        this.llistaUF = llistaUF;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final Modul other = (Modul) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    

}
