package elementos;

import Utilitats.CursNom;
import Utilitats.MatriculaDescompte;
import Utilitats.MatriculaModalitats;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Matricula implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Alumne alumne;
    private String data;
    @OneToMany(mappedBy="nomCurs")
    private CursNom cursNom;
    
    @OneToMany(mappedBy="matricula")
    private List<UnitatFormativa> llistaUF;
    
    private MatriculaDescompte descompte;
    
    private MatriculaModalitats modalitat;
    
    public Matricula() {
    }

    public Matricula(Long id, Alumne alumne, String data, List<UnitatFormativa> llistaUF, MatriculaModalitats modalitat, MatriculaDescompte descompte) {
        this.id = id;
        this.alumne = alumne;
        this.data = data;
        this.llistaUF = llistaUF;
        this.modalitat = modalitat;
        this.descompte = descompte;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public Alumne getAlumne() {
        return alumne;
    }

    public String getData() {
        return data;
    }

    public List<UnitatFormativa> getLlistaUF() {
        return llistaUF;
    }

    public MatriculaModalitats getModalitat() {
        return modalitat;
    }

    public MatriculaDescompte getDescompte() {
        return descompte;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAlumne(Alumne alumne) {
        this.alumne = alumne;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setLlistaUF(List<UnitatFormativa> llistaUF) {
        this.llistaUF = llistaUF;
    }

    public void setModalitat(MatriculaModalitats modalitat) {
        this.modalitat = modalitat;
    }

    public void setDescompte(MatriculaDescompte descompte) {
        this.descompte = descompte;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.id);
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
        final Matricula other = (Matricula) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    

}
