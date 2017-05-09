package DAO;

public interface GenericDAO<T>{
    void insertar (T t);
    
    void modificar (T t);
    
    void eliminar (T t);
    
   
}
