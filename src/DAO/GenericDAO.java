package DAO;

import java.util.List;

public interface GenericDAO<T>{
    void insertar (T t);
    
    void modificar (T t);
    
    void eliminar (T t);
    
    List<T> cercarTot();
    
    T cercarPerId(int id);
}
