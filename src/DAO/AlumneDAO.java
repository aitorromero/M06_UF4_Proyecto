package DAO;

import elementos.Alumne;

public interface AlumneDAO extends GenericDAO<Alumne> {
    void cercaAlumnePerNom(String nom);
    
    void cercaAlumnePerCognom(String cognom);
    
    void cercarAlumnes();
}
