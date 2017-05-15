package DAO;

import elementos.Curs;
import elementos.UnitatFormativa;
import java.util.List;

public interface UnitatFormativaDAO extends GenericDAO<UnitatFormativa>{
    List<UnitatFormativa> cercaUfPerCurs(Curs curs);
}
