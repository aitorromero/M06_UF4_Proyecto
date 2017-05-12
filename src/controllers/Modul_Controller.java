package controllers;

import DAO.ModulDAO;
import elementos.Modul;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class Modul_Controller implements ModulDAO {

    @Override
    public void insertar(Modul p) {
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

        System.out.println("close");
        em.close();
    }

    @Override
    public void modificar(Modul p) {
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
    public void eliminar(Modul p) {
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

    public Modul Buscar(Long id) {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");

        Modul c = (Modul) em.find(Modul.class, id);

        return c;
    }
    
    
    public void tancarEM(){
        EntityManager em = new EM_Controller().getEntityManager();

        
        System.out.println("close");
        em.close();

    }
    

    public Modul BuscarPerNom(String nom) {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("Busqueda per nom");
        Query query = em.createNamedQuery("cercaModulNom", Modul.class);
        query.setParameter("nom", nom);
        Modul c = (Modul) query.getSingleResult();
        System.out.println("close");
        em.close();
        return c;
    }

    @Override
    public Modul cercarPerId(int id) {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("busqueda");
        Query query = em.createNamedQuery(Modul.MODUL_ID, Modul.class);
        query.setParameter("id", id);
        Modul c = (Modul) query.getSingleResult();

        return c;    
    }

    @Override
    public List<Modul> cercarTot() {
        EntityManager em = new EM_Controller().getEntityManager();

        System.out.println("Consulta");
        Query a = em.createQuery("FROM Modul");
        List<Modul> lista = (List<Modul>) a.getResultList();
        return lista;
    }

}
