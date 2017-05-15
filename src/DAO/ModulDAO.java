package DAO;

import elementos.Cicle;
import elementos.Modul;
import java.util.List;

public interface ModulDAO extends GenericDAO<Modul>{
    
    List<Modul> cercarPerCicle(Cicle cicle);
}
