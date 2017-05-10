package DAO;

import elementos.Alumne;
import java.util.List;

public interface AlumneDAO extends GenericDAO<Alumne> {
    Alumne cercarPerNif(Long nif);
    
    List<Alumne> cercaAlumnePerNom(String nom);
    
    List<Alumne> cercaAlumnePerCognom(String cognom);
}
