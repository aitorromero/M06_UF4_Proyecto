package DAO;

import elementos.Alumne;
import elementos.Matricula;

public interface MatriculaDAO extends GenericDAO<Matricula>{
    void cercaAlumnePerUf(Alumne a);
    
    void cercaAlumnePerCurs(Alumne a);
    
    void cercaAlumnePerCicle(Alumne a);
    
    void cercaAlumnePerFamilia(Alumne a);
    
    void cercaMatriculaPerNif(Long nif);
    
    void cercaMatricules();
}
