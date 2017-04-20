package elementos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cicle implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String grau;
    private List<Modul> listaModulos;
    private List<Curs> listaCursos;

    public Cicle() {
    }

    public Cicle(Long id, String nom, String grau, List<Modul> listaModulos, List<Curs> listaCursos) {
        this.id = id;
        this.nom = nom;
        this.grau = grau;
        this.listaModulos = listaModulos;
        this.listaCursos = listaCursos;
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
