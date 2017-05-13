package DAO;

import elementos.Cicle;
import elementos.Familia;
import java.util.List;

public interface CicleDAO extends GenericDAO<Cicle>{
    
    List<Cicle> cercaPerFamilia(Familia familia);
}
