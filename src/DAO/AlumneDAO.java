package DAO;

import elementos.Alumne;
import java.util.List;

public interface AlumneDAO extends GenericDAO<Alumne> {
    List<Alumne> cercaAlumnePerNom(String nom);
    
    List<Alumne> cercaAlumnePerCognom(String cognom);
}
