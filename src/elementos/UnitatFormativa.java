package elementos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class UnitatFormativa implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private int hores;
    
    
    @ManyToMany
    private List<Matricula> matricules;    
    
    @ManyToOne
    @JoinColumn
    private Modul modul;    
    
    @ManyToOne
    @JoinColumn
    private Curs curs;

    public UnitatFormativa() {
    }

    public UnitatFormativa(Long id, String nom, int hores, List<Matricula> matricules, Modul modul, Curs curs) {
        this.id = id;
        this.nom = nom;
        this.hores = hores;
        this.matricules = matricules;
        this.modul = modul;
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

    public int getHores() {
        return hores;
    }

    public void setHores(int hores) {
        this.hores = hores;
    }

    public List<Matricula> getUf() {
        return matricules;
    }

    public void setMatricules(List<Matricula> matricules) {
        this.matricules = matricules;
    }


    public Modul getModul() {
        return modul;
    }

    public void setModul(Modul modul) {
        this.modul = modul;
    }

    public Curs getCurs() {
        return curs;
    }

    public void setCurs(Curs curs) {
        this.curs = curs;
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
        final UnitatFormativa other = (UnitatFormativa) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}
