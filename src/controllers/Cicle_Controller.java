package controllers;

import DAO.CicleDAO;
import elementos.Alumne;
import elementos.Cicle;
import elementos.Familia;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class Cicle_Controller implements CicleDAO {

    EntityManager em;

    @Override
    public void insertar(Cicle p) {
        EM_Controller oem = new EM_Controller();
        EntityManager em = oem.getEntityManager();

        //em.getTransaction().begin();
        EntityTransaction etx = em.getTransaction();

        System.out.println("begin");
        etx.begin();

        System.out.println("persist");
        em.persist(p);

        System.out.println("commit");
        //em.getTransaction().commit();
        etx.commit();
//
//        System.out.println("close");
//        em.close();
    }

    @Override
    public void modificar(Cicle p) {
        EM_Controller oem = new EM_Controller();
        EntityManager em = oem.getEntityManager();

        //em.getTransaction().begin();
        EntityTransaction etx = em.getTransaction();

        System.out.println("begin");
        etx.begin();

        System.out.println("merge");
        em.merge(p);

        System.out.println("commit");
        //em.getTransaction().commit();
        etx.commit();

        System.out.println("close");
        em.close();
    }

    @Override
    public void eliminar(Cicle p) {
        EM_Controller oem = new EM_Controller();
        EntityManager em = oem.getEntityManager();

        //em.getTransaction().begin();
        EntityTransaction etx = em.getTransaction();

        System.out.println("begin");
        etx.begin();

        System.out.println("remove");
        em.remove(em.contains(p) ? p : em.merge(p));

        System.out.println("commit");
        //em.getTransaction().commit();
        etx.commit();

        System.out.println("close");
        em.close();
    }

    public Cicle Buscar(Long id) {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");

        Cicle c = (Cicle) em.find(Cicle.class, id);

        return c;
    }

    public Cicle BuscarPerNom(String nom) {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("Busqueda per nom");
        Query query = em.createNamedQuery("cercaCicleNom", Cicle.class);
        query.setParameter("nom", nom);
        Cicle c = (Cicle) query.getSingleResult();
        System.out.println("close");
        em.close();
        return c;
    }

    public void tancarEM() {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("close");

        em.close();

    }

    @Override
    public Cicle cercarPerId(Long id) {
        em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Cicle.CICLE_ID, Cicle.class);
        query.setParameter("id", id);
        Cicle c = (Cicle) query.getSingleResult();

        return c;
    }
    
    
    

    @Override
    public List<Cicle> cercarTot() {
        em = new EM_Controller().getEntityManager();

        System.out.println("Consulta");
        Query a = em.createQuery("FROM Cicle");
        List<Cicle> lista = (List<Cicle>) a.getResultList();
        return lista;
    }

    @Override
    public List<Cicle> cercaPerFamilia(Familia familia) {
    
     em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Cicle.CICLE_FAMILIA, Cicle.class);
        
        query.setParameter("familia", familia);
        
        List<Cicle> families = query.getResultList();
        
        
        System.out.println("close");
        em.close();
        
        return families;
        
        
    }

}
