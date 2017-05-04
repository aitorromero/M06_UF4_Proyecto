package elementos;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Alumne implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    
    private Long nif;
    private String nom;
    private String cognom;
    private String correu;
    private int telefon;

    @OneToOne(mappedBy = "alumne")
    private Matricula matriculaAlumne;

    public Alumne() {
    }

    public Alumne(String nom, String cognom, String correu, int telefon, Matricula matriculaAlumne) {
        this.nom = nom;
        this.cognom = cognom;
        this.correu = correu;
        this.telefon = telefon;
        this.matriculaAlumne = matriculaAlumne;
    }

    public Matricula getMatriculaAlumne() {
        return matriculaAlumne;
    }

    public void setMatriculaAlumne(Matricula matriculaAlumne) {
        this.matriculaAlumne = matriculaAlumne;
    }
    
    
    public Long getNif() {
        return nif;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public String getCorreu() {
        return correu;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setNif(Long nif) {
        this.nif = nif;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public void setCorreu(String correu) {
        this.correu = correu;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nif);
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
        final Alumne other = (Alumne) obj;
        if (!Objects.equals(this.nif, other.nif)) {
            return false;
        }
        return true;
    }    
    
}
