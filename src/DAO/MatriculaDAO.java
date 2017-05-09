package DAO;

import elementos.Alumne;
import elementos.Matricula;

public interface MatriculaDAO extends GenericDAO<Matricula>{
    void cercaMatriculaPerUf(Alumne a);
    
    void cercaMatriculaPerCurs(Alumne a);
    
    void cercaMatriculaPerCicle(Alumne a);
    
    void cercaMatriculaPerFamilia(Alumne a);
    
    void cercaMatriculaPerNif(Long nif);

}
