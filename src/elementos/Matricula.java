package elementos;

import Utilitats.CursNom;
import Utilitats.MatriculaDescompte;
import Utilitats.MatriculaModalitats;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@NamedQueries({
@NamedQuery(name= Matricula.MATRICULA_ALUMNE, query="SELECT m FROM Matricula m WHERE m.alumne.nif=:nif"),
@NamedQuery(name= Matricula.MATRICULA_ALUMNE_UF, query="SELECT m FROM Matricula m WHERE m.unitatsFormatives.idUF=:uf"),
@NamedQuery(name= Matricula.MATRICULA_ALUMNE_CURS, query="SELECT m FROM Matricula m WHERE m.unitatsFormatives.idCurs.idCurs=:curs"),
@NamedQuery(name= Matricula.MATRICULA_ALUMNE_CICLE, query="SELECT m FROM Matricula m WHERE m.unitatsFormatives.idCurs.cicleCurs.idCicle IN (:cicle)"),
@NamedQuery(name= Matricula.MATRICULA_ALUMNE_FAMILIA, query="SELECT m FROM Matricula m WHERE m.unitatsFormatives.idCurs.cicleCurs.familiaCicle.idF IN (:familia)")})

public class Matricula implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    public static final String MATRICULA_ALUMNE = "buscar_per_alumne";
    public static final String MATRICULA_ALUMNE_UF = "buscar_per_UF";
    public static final String MATRICULA_ALUMNE_CURS = "buscar_per_Curs";
    public static final String MATRICULA_ALUMNE_CICLE = "buscar_per_Cicle";
    public static final String MATRICULA_ALUMNE_FAMILIA = "buscar_per_Familia";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToOne
    @JoinColumn(name="idAlumne")
    private Alumne alumne;
    
    private String fecha;
    
    
    @ManyToMany(mappedBy="matricules", cascade = CascadeType.ALL)
    private List<UnitatFormativa> llistaUF;    

    private MatriculaDescompte descompte;    
    private MatriculaModalitats modalitat;
    
    public Matricula() {
    }

    
    public Matricula(Alumne alumne, String data, List<UnitatFormativa> llistaUF, MatriculaDescompte descompte, MatriculaModalitats modalitat) {
        this.alumne = alumne;
        this.fecha = data;
        this.llistaUF = llistaUF;
        this.descompte = descompte;
        this.modalitat = modalitat;
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

    public String getFecha() {
        return fecha;
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

    public void setFecha(String fecha) {
        this.fecha = fecha;
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
