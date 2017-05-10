package DAO;

import elementos.Cicle;
import elementos.Curs;
import elementos.Familia;
import elementos.Matricula;
import elementos.UnitatFormativa;

public interface MatriculaDAO extends GenericDAO<Matricula>{
    Matricula cercaAlumnePerUf(UnitatFormativa uf);
    
    Matricula cercaAlumnePerCurs(Curs curs);
    
    Matricula cercaAlumnePerCicle(Cicle cicle);
    
    Matricula cercaAlumnePerFamilia(Familia familia);
    
    Matricula cercaAlumnePerNif(Long nif);

}
