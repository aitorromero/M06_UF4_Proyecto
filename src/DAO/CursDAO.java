package DAO;

import elementos.Curs;
import java.util.List;

public interface CursDAO extends GenericDAO<Curs>{
    List<UF> cercaPerFamilia(Curs Curs);
}
