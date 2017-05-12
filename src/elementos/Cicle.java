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
@NamedQuery(name= Cicle.CICLE_ID, query="SELECT c FROM Cicle c WHERE c.id=:id"),
        @NamedQuery(name= Cicle.CICLE_FAMILIA, query= "SELECT c FROM Cicle c WHERE c.familia=:familia")})
public class Cicle implements Serializable{

    private static final long serialVersionUID = 1L;
    
    public static final String CICLE_ID = "cicle_id";
    public static final String CICLE_FAMILIA = "cicles_per_familia";
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String grau;    
    
    @OneToMany(mappedBy="cicle", cascade = CascadeType.ALL)
    private List<Modul> listaModulos;    
    
    @OneToMany(mappedBy="cicle", cascade = CascadeType.ALL)
    private List<Curs> listaCursos;    
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idFamilia")
    private Familia familia;

    public Cicle() {
    }

    public Cicle( String nom, String grau, Familia familia) {
        this.nom = nom;
        this.grau = grau;
        this.familia = familia;
    }

    public String getNom() {
        return nom;
    }

    public String getGrau() {
        return grau;
    }

    public List<Modul> getListaModulos() {
        return listaModulos;
    }

    public List<Curs> getListaCursos() {
        return listaCursos;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    public void setListaModulos(List<Modul> listaModulos) {
        this.listaModulos = listaModulos;
    }

    public void setListaCursos(List<Curs> listaCursos) {
        this.listaCursos = listaCursos;
    }   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final Cicle other = (Cicle) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
