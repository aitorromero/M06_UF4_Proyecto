package elementos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Matricula implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String alumne;
    private String data;
    private List<UnitatFormativa> llistaUF;
    private String modalitat;
    private String descompte;

    public Matricula() {
    }

    public Matricula(Long id, String alumne, String data, List<UnitatFormativa> llistaUF, String modalitat, String descompte) {
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

    public String getAlumne() {
        return alumne;
    }

    public String getData() {
        return data;
    }

    public List<UnitatFormativa> getLlistaUF() {
        return llistaUF;
    }

    public String getModalitat() {
        return modalitat;
    }

    public String getDescompte() {
        return descompte;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAlumne(String alumne) {
        this.alumne = alumne;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setLlistaUF(List<UnitatFormativa> llistaUF) {
        this.llistaUF = llistaUF;
    }

    public void setModalitat(String modalitat) {
        this.modalitat = modalitat;
    }

    public void setDescompte(String descompte) {
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
