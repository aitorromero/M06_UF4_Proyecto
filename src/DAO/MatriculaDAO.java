package DAO;

import elementos.Alumne;
import elementos.Cicle;
import elementos.Curs;
import elementos.Familia;
import elementos.Matricula;
import elementos.UnitatFormativa;
import java.util.List;

public interface MatriculaDAO extends GenericDAO<Matricula>{
    List<Alumne> cercaAlumnePerUf(UnitatFormativa uf);
    
    List<Alumne> cercaAlumnePerCurs(Curs curs);
    
    List<Alumne> cercaAlumnePerCicle(Cicle cicle);
    
    List<Alumne> cercaAlumnePerFamilia(Familia familia);
    
    Matricula cercaAlumnePerNif(Long nif);

}
