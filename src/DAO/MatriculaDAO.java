package DAO;

import elementos.Alumne;
import elementos.Matricula;

public interface MatriculaDAO extends GenericDAO<Matricula>{
    Matricula cercaMatriculaPerUf(Alumne a);
    
    Matricula cercaMatriculaPerCurs(Alumne a);
    
    Matricula cercaMatriculaPerCicle(Alumne a);
    
    Matricula cercaMatriculaPerFamilia(Alumne a);
    
    Matricula cercaMatriculaPerNif(Long nif);

}
